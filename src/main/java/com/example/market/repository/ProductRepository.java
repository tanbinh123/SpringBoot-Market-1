package com.example.market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.market.entity.ProductEntity;
import com.example.market.entity.ShopEntity;
import com.example.market.entity.UserEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

	List<ProductEntity> findByOwner(UserEntity owner);

	List<ProductEntity> findByShop(ShopEntity shop);

	List<ProductEntity> findByShopIsNull();

	List<ProductEntity> findByNameContainsIgnoreCaseAndShopIsNull(String name);

	List<ProductEntity> findByNameContainsIgnoreCaseAndOwner(String name, UserEntity owner);

}
