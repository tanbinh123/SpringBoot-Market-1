package com.example.market.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Shop {

	@Id
	@GeneratedValue
	private long id;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date shopDate;

	@ManyToOne
	private User owner;

	public Shop() {
	}

	public Shop(Date shopDate, User owner) {
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getShopDate() {
		return shopDate;
	}

	public void setShopDate(Date shopDate) {
		this.shopDate = shopDate;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
