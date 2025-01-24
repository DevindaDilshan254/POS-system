package com.myorganization.pos_system.controller;

import com.myorganization.pos_system.dto.CustomerDTO;
import com.myorganization.pos_system.dto.requestDTO.CustomerUpdateDTO;
import com.myorganization.pos_system.entity.Customer;
import com.myorganization.pos_system.service.CUSTOMER_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController //@ResponseBody+@Controller  ,provide restful service
@RequestMapping("api/v1/customer")//map the controller(Handler mapping)
public class CustomerController {
    @Autowired //dependency injection pattern inherit from singleton design pattern (To use get the created object exist inside the bean/this is a property injection)
    private CUSTOMER_SERVICE customer_service;//spring scan the @Service,@Component

@PostMapping("/save-customer")//map the method (handler mapping)
    public String saveCustomer(@RequestBody CustomerDTO customer_dto ){//@RequestBody-map json to DTO
    return customer_service.saveCustomer(customer_dto);
    }
@PutMapping("/update-customer-by-id")
    public String updateCustomerByID(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
    return customer_service.updateCustomerByID(customerUpdateDTO);}

   @GetMapping(path = "get-customer-by-id",params = "id")
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerID) {
    CustomerDTO customerDTO=customer_service.getCustomerById(customerID);
    return customerDTO;
    }

    @GetMapping("get-all-customers")
    public List<CustomerDTO> getAllCustomers(){
    List<CustomerDTO> allCustomers =customer_service.getAllCustomers();
    return allCustomers;
    }

    @DeleteMapping("delete-customer-by-id/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int customerID ){
    String deleteStatus=customer_service.deleteCustomer(customerID);
    return deleteStatus;
    }

    @GetMapping("get-customers-by-active-status/{active-status}")
    public List<CustomerDTO> getCustomersByActiveStatus(@PathVariable(value = "active-status") boolean ActiveStatus){
     List<CustomerDTO> customerDTOList=customer_service.getCustomersByActiveStatus(ActiveStatus);
     return customerDTOList;
    }


}

