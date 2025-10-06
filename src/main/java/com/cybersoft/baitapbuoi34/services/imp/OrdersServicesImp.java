package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Orders;
import com.cybersoft.baitapbuoi34.repository.OrdersRepository;
import com.cybersoft.baitapbuoi34.services.OrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdersServicesImp implements OrdersServices {

    @Autowired
    private OrdersRepository ordersRepository;
    @Override
    public List<Orders> getOrdersByDate(LocalDateTime startDate, LocalDateTime endDate) {
        return ordersRepository.findOrdersByDate(startDate, endDate);
    }

    @Override
    public List<Orders> getOrdersByTotalAmountLimit() {
        return ordersRepository.findOrdersByTotalAmountDesc();
    }
}
