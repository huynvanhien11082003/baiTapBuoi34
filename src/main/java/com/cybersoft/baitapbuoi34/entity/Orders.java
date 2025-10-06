package com.cybersoft.baitapbuoi34.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "orders")
public class Orders {
    @Id
    private int id;
    @Column(name = "customername")
    private String customername;
    @Column(name = "totalamount")
    private Long totalamount;
    @Column(name = "create_at")
    private LocalDateTime createat;
}
