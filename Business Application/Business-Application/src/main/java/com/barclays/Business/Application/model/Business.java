package com.barclays.Business.Application.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column
	private Date date_of_birth;

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

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Business(long customer_id, String emailid, String name, Date date_of_birth) {
		super();
		this.customer_id = customer_id;
		this.emailid = emailid;
		this.name = name;
		this.date_of_birth = date_of_birth;
	}
	
	
}
