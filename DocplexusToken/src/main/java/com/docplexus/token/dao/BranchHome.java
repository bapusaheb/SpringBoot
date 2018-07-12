package com.docplexus.token.dao;
// Generated 12 Jul, 2018 4:24:16 PM by Hibernate Tools 5.2.8.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.docplexus.token.orm.Branch;

/**
 * Home object for domain model class Branch.
 * @see com.docplexus.token.orm.Branch
 * @author Hibernate Tools
 */
@Component
public class BranchHome {

	private static final Log log = LogFactory.getLog(BranchHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Branch transientInstance) {
		log.debug("persisting Branch instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Branch persistentInstance) {
		log.debug("removing Branch instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Branch merge(Branch detachedInstance) {
		log.debug("merging Branch instance");
		try {
			Branch result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Branch findById(Long id) {
		log.debug("getting Branch instance with id: " + id);
		try {
			Branch instance = entityManager.find(Branch.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
