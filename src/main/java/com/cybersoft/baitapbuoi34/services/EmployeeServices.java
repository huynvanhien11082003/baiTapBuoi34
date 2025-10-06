package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeServices {

    public Page<Employee> getEmployee(Pageable pageable);
}
