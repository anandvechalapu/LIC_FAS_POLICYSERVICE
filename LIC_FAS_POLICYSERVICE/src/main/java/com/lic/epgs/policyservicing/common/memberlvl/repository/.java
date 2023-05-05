package com.lic.epgs.policyservicing.common.memberlvl.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;

@Repository
public class CommissionRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionRepository.class);

    @PersistenceContext
    EntityManager entityManager;

    public List<CommissionEntity> getInprogressLoad(String role, String unitCode) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<CommissionEntity> criteria = builder.createQuery(CommissionEntity.class);
        Root<CommissionEntity> root = criteria.from(CommissionEntity.class);
        criteria.select(root);
        criteria.where(builder.equal(root.get("role"), role), builder.equal(root.get("unitCode"), unitCode));
        Query query = entityManager.createQuery(criteria);
        return query.getResultList();
    }

    public List<CommissionEntity> getInprogressMakerLoad(String role, String unitCode) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<CommissionEntity> criteria = builder.createQuery(CommissionEntity.class);
        Root<CommissionEntity> root = criteria.from(CommissionEntity.class);
        criteria.select(root);
        criteria.where(builder.equal(root.get("role"), role), builder.equal(root.get("unitCode"), unitCode));
        Query query = entityManager.createQuery(criteria);
        return query.getResultList();
    }

    public Optional<CommissionEntity> findById(Long id) {
        return Optional.ofNullable(entityManager.find(CommissionEntity.class, id));
    }

    public CommissionEntity save(CommissionEntity commissionEntity) {
        entityManager.persist(commissionEntity);
        return commissionEntity;
    }

    public void delete(CommissionEntity commissionEntity) {
        entityManager.remove(commissionEntity);
    }

    public CommissionDetailsEntity saveCommissionDetails(CommissionDetailsEntity commissionDetailsEntity) {
        entityManager.persist(commissionDetailsEntity);
        return commissionDetailsEntity;
    }

    public void deleteCommissionDetails(CommissionDetailsEntity commissionDetailsEntity) {
        entityManager.remove(commissionDetailsEntity);
    }
}