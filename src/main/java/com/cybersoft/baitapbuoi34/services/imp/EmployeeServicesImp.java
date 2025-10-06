package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Employee;
import com.cybersoft.baitapbuoi34.repository.EmployeeRepository;
import com.cybersoft.baitapbuoi34.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImp implements EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Page<Employee> getEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
}
