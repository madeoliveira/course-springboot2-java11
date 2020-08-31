package com.training.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
