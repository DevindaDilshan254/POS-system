package com.myorganization.pos_system.service;

import com.myorganization.pos_system.dto.CustomerDTO;
import com.myorganization.pos_system.dto.requestDTO.CustomerUpdateDTO;

import java.util.List;

//To eliminate tightly coupling(loosely coupling)
public interface CUSTOMER_SERVICE {
    public String saveCustomer(CustomerDTO customerDTO);
    String updateCustomerByID(CustomerUpdateDTO customerUpdateDTO);
    CustomerDTO getCustomerById(int customerID);
    List<CustomerDTO> getAllCustomers();
}
