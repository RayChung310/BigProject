package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ShippingOrderDetail;

public interface ShippingOrderDetailRepository extends JpaRepository<ShippingOrderDetail, Integer> {
	
}
