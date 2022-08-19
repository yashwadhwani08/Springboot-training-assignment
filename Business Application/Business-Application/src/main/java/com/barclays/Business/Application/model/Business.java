package com.barclays.Business.Application.model;

import java.util.Date;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="customer")
public class Business {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customer_id;
	
	@Column
	private String emailid;
	
	@Column
	private String name;
	

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date timestamp;

	@PrePersist
	private void onCreate() {
	    timestamp = new Date();
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public Business() {
		super();
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Business(long customer_id, String emailid, String name, Date timestamp) {
		super();
		this.customer_id = customer_id;
		this.emailid = emailid;
		this.name = name;
		this.timestamp = timestamp;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
