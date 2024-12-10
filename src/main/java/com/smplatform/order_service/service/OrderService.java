package com.smplatform.order_service.service;

import com.smplatform.order_service.dto.OrderDto;

public interface OrderService {
    OrderDto getOrder(int orderNo);

    String registerOrder(OrderDto orderDto);
}
