package com.cybersoft.baitapbuoi34.repository;

import com.cybersoft.baitapbuoi34.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query("SELECT o FROM orders o WHERE o.createat BETWEEN :startDate AND :endDate")
    List<Orders> findOrdersByDate(@Param("startDate")LocalDateTime startDate, @Param("endDate")LocalDateTime endDate);

    @Query("SELECT o\n" +
            "FROM orders o \n" +
            "ORDER BY o.totalamount DESC\n" +
            "LIMIT 5")
    List<Orders> findOrdersByTotalAmountDesc();

}
