package com.barclays.Business.Application.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="card")
public class Card {

	@Id
	private long card_id;
	
	@Column
	private String card_number;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date expiry_date;

	@PrePersist
	private void onCreate() {
	    expiry_date = new Date();
	}

	
	@Column
	private long cust_id;

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public long getCard_id() {
		return card_id;
	}

	public void setCard_id(long card_id) {
		this.card_id = card_id;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}



	public Card(long card_id, String card_number, Date expiry_date, long cust_id) {
		super();
		this.card_id = card_id;
		this.card_number = card_number;
		this.expiry_date = expiry_date;
		this.cust_id = cust_id;
	}

	public Card() {
		super();
	}

}
