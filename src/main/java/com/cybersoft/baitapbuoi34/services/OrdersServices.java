package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.entity.Orders;

import java.time.LocalDateTime;
import java.util.List;

public interface OrdersServices {
    List<Orders> getOrdersByDate(LocalDateTime startDate, LocalDateTime endDate);

    List<Orders> getOrdersByTotalAmountLimit();
}
