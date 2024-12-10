package com.smplatform.order_service.service.impl;

import com.smplatform.order_service.dto.OrderDto;
import com.smplatform.order_service.repository.OrderRepository;
import com.smplatform.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderDto getOrder(int orderNo) {
        Optional<OrderDto> orderBean = orderRepository.findById(orderNo);
        if (orderBean.isEmpty()) {
            throw new RuntimeException("존재하지 않는 주문 입니다.");
        }
        OrderDto orderDto = orderBean.get();

        return orderDto;
    }

    @Override
    public String registerOrder(OrderDto orderDto) {

        orderRepository.save(orderDto);

        return "주문 완료 : " + orderDto.getOrderNo();
    }
}
