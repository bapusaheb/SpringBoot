package com.docplexus.token.orm;
// Generated Jul 15, 2018 12:53:33 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Home object for domain model class Branch.
 * @see com.docplexus.token.orm.Branch
 * @author Hibernate Tools
 */
@Component
public interface BranchHome extends CrudRepository<Branch, Long> {
	
}
