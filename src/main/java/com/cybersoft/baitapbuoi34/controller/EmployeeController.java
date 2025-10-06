package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.entity.Employee;
import com.cybersoft.baitapbuoi34.services.imp.EmployeeServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeServicesImp employeeServicesImp;

    @GetMapping
    public ResponseEntity<?> getEmployee(Pageable pageable) {
        List<Employee> employeeList = employeeServicesImp.getEmployee(pageable).getContent();
        return ResponseEntity.ok("");
    }
}
