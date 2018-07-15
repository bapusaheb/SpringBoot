package com.docplexus.token.orm;
// Generated Jul 15, 2018 1:29:22 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Home object for domain model class Bank.
 * @see com.docplexus.token.orm.Bank
 * @author Hibernate Tools
 */
@Component
public class BankHome {

	private static final Log log = LogFactory.getLog(BankHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bank transientInstance) {
		log.debug("persisting Bank instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bank persistentInstance) {
		log.debug("removing Bank instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bank merge(Bank detachedInstance) {
		log.debug("merging Bank instance");
		try {
			Bank result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bank findById(Long id) {
		log.debug("getting Bank instance with id: " + id);
		try {
			Bank instance = entityManager.find(Bank.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
