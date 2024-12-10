package com.smplatform.order_service.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDER")
public class OrderDto {

    @Id
    @Column(name = "order_no")
    private int orderNo;

    @Column(name = "member_id")
    private int memberId;

    @Column(name = "order_date")
    private LocalDateTime oderDate;

    @Column(name = "total_price")
    private int totalPrice;

    @Column(name = "status")
    private String status;
}
