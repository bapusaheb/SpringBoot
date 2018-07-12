package com.docplexus.token.dao;
// Generated 12 Jul, 2018 4:24:16 PM by Hibernate Tools 5.2.8.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.docplexus.token.orm.Token;

/**
 * Home object for domain model class Token.
 * @see com.docplexus.token.orm.Token
 * @author Hibernate Tools
 */
@Component
public class TokenHome {

	private static final Log log = LogFactory.getLog(TokenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Token transientInstance) {
		log.debug("persisting Token instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Token persistentInstance) {
		log.debug("removing Token instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Token merge(Token detachedInstance) {
		log.debug("merging Token instance");
		try {
			Token result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Token findById(Long id) {
		log.debug("getting Token instance with id: " + id);
		try {
			Token instance = entityManager.find(Token.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
