package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.dto.CustomerDTO;
import com.cybersoft.baitapbuoi34.services.imp.CustomerServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServicesImp customerServices;

    @GetMapping()
    public ResponseEntity<?> getAllUsers(){
        List<CustomerDTO> customerList = customerServices.getAllCustomers();
        return ResponseEntity.ok(customerList);
    }
}
