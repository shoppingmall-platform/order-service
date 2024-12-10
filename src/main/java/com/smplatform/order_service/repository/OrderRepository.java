package com.smplatform.order_service.repository;

import com.smplatform.order_service.dto.OrderDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDto, Integer> {
}
