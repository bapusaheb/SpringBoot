package com.docplexus.token.orm;
// Generated Jul 15, 2018 1:29:22 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Home object for domain model class Banker.
 * @see com.docplexus.token.orm.Banker
 * @author Hibernate Tools
 */
@Component
public class BankerHome {

	private static final Log log = LogFactory.getLog(BankerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Banker transientInstance) {
		log.debug("persisting Banker instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Banker persistentInstance) {
		log.debug("removing Banker instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Banker merge(Banker detachedInstance) {
		log.debug("merging Banker instance");
		try {
			Banker result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Banker findById(Long id) {
		log.debug("getting Banker instance with id: " + id);
		try {
			Banker instance = entityManager.find(Banker.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
