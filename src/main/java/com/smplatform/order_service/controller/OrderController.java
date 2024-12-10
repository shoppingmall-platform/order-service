package com.smplatform.order_service.controller;

import com.smplatform.order_service.dto.OrderDto;
import com.smplatform.order_service.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/order")
@Tag(name = "Order", description = "Order management APIs")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/{orderNo}")
    @Operation(summary = "order 조회", description = "해당 주문 조회")
    public ResponseEntity<OrderDto> getOrder(@PathVariable int orderNo) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrder(orderNo));
    }

    @PostMapping
    @Operation(summary = "order 등록", description = "신규 주문 등록")
    public ResponseEntity<String> registerOrder(@RequestBody OrderDto orderDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.registerOrder(orderDto));
    }
}

