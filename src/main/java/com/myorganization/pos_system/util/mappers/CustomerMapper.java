package com.myorganization.pos_system.util.mappers;

import com.myorganization.pos_system.dto.CustomerDTO;
import com.myorganization.pos_system.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer CustomerDtoToCustomerEntity(CustomerDTO customerDTO);
    CustomerDTO CustomerEntityToCustomerDto(Customer customer);
    List<CustomerDTO> CustomerEntityListToCustomerDtoList(List<Customer> customerEntityList);
}
