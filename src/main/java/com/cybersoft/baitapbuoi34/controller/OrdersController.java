package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.services.imp.OrdersServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersServicesImp ordersServicesImp;

    @GetMapping
    public ResponseEntity<?> getOrrdersByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return  ResponseEntity.ok(ordersServicesImp.getOrdersByDate(startDate, endDate));
    }

    @GetMapping("/top")
    public ResponseEntity<?> getOrdersTop()
    {
        return ResponseEntity.ok(ordersServicesImp.getOrdersByTotalAmountLimit());
    }

}
