package com.example.market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.market.entity.ShopEntity;
import com.example.market.entity.UserEntity;

public interface ShopRepository extends JpaRepository<ShopEntity, Long> {

	List<ShopEntity> findByOwner(UserEntity owner);

}
