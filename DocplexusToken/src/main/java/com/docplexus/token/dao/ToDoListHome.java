package com.docplexus.token.dao;
// Generated 29 Mar, 2018 2:53:11 PM by Hibernate Tools 5.2.8.Final

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.docplexus.token.orm.ToDoList;

/**
 * Home object for domain model class ToDoList.
 * @see com.docplexus.token.orm.ToDoList
 * @author Hibernate Tools
 */
@Component
public class ToDoListHome {

	private static final Log log = LogFactory.getLog(ToDoListHome.class);

	public static Session getSessionFromEntityManger(EntityManager entityManager) {
		return entityManager.unwrap(Session.class);
	}
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void saveOrUpdate(ToDoList transientInstance) {
		log.debug("persisting ToDoList instance");
		try {
			Session session= getSessionFromEntityManger(entityManager);
			session.saveOrUpdate(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}
	
	

  @Transactional  
	public void remove(ToDoList persistentInstance) {
		log.debug("removing ToDoList instance");
		try {
			entityManager.remove(findById(persistentInstance.getId()));
			    
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ToDoList merge(ToDoList detachedInstance) {
		log.debug("merging ToDoList instance");
		try {
			ToDoList result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ToDoList findById(Integer id) {
		log.debug("getting ToDoList instance with id: " + id);
		try {
			ToDoList instance = entityManager.find(ToDoList.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public List<ToDoList> getall() {
		log.debug("getting ToDoList instance with");
		try {
			CriteriaQuery<ToDoList> criteria = entityManager.getCriteriaBuilder().createQuery(ToDoList.class);
		    criteria.select(criteria.from(ToDoList.class));
		    List<ToDoList> doLists = entityManager.createQuery(criteria).getResultList();
		    return doLists;
			
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
}
