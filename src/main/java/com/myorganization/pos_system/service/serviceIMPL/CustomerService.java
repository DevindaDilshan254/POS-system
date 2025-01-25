package com.myorganization.pos_system.service.serviceIMPL;

import com.myorganization.pos_system.dto.CustomerDTO;
import com.myorganization.pos_system.dto.requestDTO.CustomerUpdateDTO;
import com.myorganization.pos_system.entity.Customer;
import com.myorganization.pos_system.exception.NotFoundException;
import com.myorganization.pos_system.repository.CUSTOMER_REPO;
import com.myorganization.pos_system.service.CUSTOMER_SERVICE;
import com.myorganization.pos_system.util.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service // define the business logic and create bean(@Component) in container/spring context
public class CustomerService implements CUSTOMER_SERVICE {
    @Autowired
    private CUSTOMER_REPO customer_repo;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = customerMapper.CustomerDtoToCustomerEntity(customerDTO);//this is created in heap,If you need created this as bean in context... use @Component annotation and return an Entity Class
        customer_repo.save(customer);
        return "saved";
    }

    @Override
    public String updateCustomerByID(CustomerUpdateDTO customerUpdateDTO) {
        if (customer_repo.existsById(customerUpdateDTO.getCustomerId())) {
            Customer customer = customer_repo.getReferenceById(customerUpdateDTO.getCustomerId());
            customer.setCustomerName(customerUpdateDTO.getCustomerName());
            customer.setCustomerSalary(customerUpdateDTO.getCustomerSalary());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());

            customer_repo.save(customer); //update = save method using existed id
            return customerUpdateDTO.getCustomerName()+" updated successfully";
        }else{
        throw new RuntimeException("data not found");
    }

}

    @Override
    public CustomerDTO getCustomerById(int customerID) {
        if(customer_repo.existsById(customerID)){
            Customer customer=customer_repo.getReferenceById(customerID);
            CustomerDTO customerDTO=customerMapper.CustomerEntityToCustomerDto(customer);
            return customerDTO;
        }else{
        throw new NotFoundException("customer not found");//return a ResponseEntity through the customize Exception
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> allCustomersEntityList=customer_repo.findAll();
        List<CustomerDTO> allCustomersDTOList=new ArrayList<>();
        allCustomersDTOList=customerMapper.CustomerEntityListToCustomerDtoList(allCustomersEntityList);
        return allCustomersDTOList;
    }

    @Override
    public String deleteCustomer(int customerID) {
        if (customer_repo.existsById(customerID)) {
            customer_repo.deleteById(customerID);
            return customerID+" is deleted";
        } else {
            throw new RuntimeException("ID is not found");
        }

    }

    @Override
    public List<CustomerDTO> getCustomersByActiveStatus(boolean activeStatus) {
        List<Customer> allCustomersEntityList=customer_repo.findAllByActiveStatusEquals(activeStatus);
        List<CustomerDTO> allCustomersDTOList=customerMapper.CustomerEntityListToCustomerDtoList(allCustomersEntityList);
        return allCustomersDTOList;

    }



}