package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.dto.CustomerDTO;
import com.cybersoft.baitapbuoi34.entity.Customer;
import com.cybersoft.baitapbuoi34.repository.CustomerRepository;
import com.cybersoft.baitapbuoi34.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServicesImp implements CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customersList = customerRepository.findAll();
        List<CustomerDTO> customerDTOSList = new ArrayList<>();

        for(Customer customer : customersList){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setName(customer.getEmail());
            customerDTO.setPhone(customer.getPhone());

            customerDTOSList.add(customerDTO);
        }

        return customerDTOSList;
    }
}
