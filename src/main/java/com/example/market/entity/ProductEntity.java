package com.example.market.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductEntity {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	private float price;

	private String image;

	@ManyToOne
	private UserEntity owner;

	@ManyToOne
	private ShopEntity shop;

	public ProductEntity() {
	}

	public ProductEntity(String name, float price, String image, UserEntity owner) {
		super();
		this.name = name;
		this.price = price;
		this.image = image;
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public UserEntity getOwner() {
		return owner;
	}

	public void setOwner(UserEntity owner) {
		this.owner = owner;
	}

	public ShopEntity getShop() {
		return shop;
	}

	public void setShop(ShopEntity shop) {
		this.shop = shop;
	}

}
