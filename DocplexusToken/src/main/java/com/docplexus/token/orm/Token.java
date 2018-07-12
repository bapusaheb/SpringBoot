package com.docplexus.token.orm;
// Generated 12 Jul, 2018 4:24:16 PM by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Token generated by hbm2java
 */
@Entity
@Table(name = "token", catalog = "tokenMgt")
public class Token implements java.io.Serializable {

	private Long id;
	private Long counter;
	private Boolean priority;
	private Boolean served;

	public Token() {
	}

	public Token(Long counter, Boolean priority, Boolean served) {
		this.counter = counter;
		this.priority = priority;
		this.served = served;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "counter")
	public Long getCounter() {
		return this.counter;
	}

	public void setCounter(Long counter) {
		this.counter = counter;
	}

	@Column(name = "priority")
	public Boolean getPriority() {
		return this.priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	@Column(name = "served")
	public Boolean getServed() {
		return this.served;
	}

	public void setServed(Boolean served) {
		this.served = served;
	}

}
