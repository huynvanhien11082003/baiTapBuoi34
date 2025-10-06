package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.dto.CustomerDTO;
import com.cybersoft.baitapbuoi34.entity.Customer;

import java.util.List;

public interface CustomerServices {
    List<CustomerDTO> getAllCustomers();
}
