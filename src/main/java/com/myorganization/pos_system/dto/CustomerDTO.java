package com.myorganization.pos_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Customer class is a pojo -plain old java object ,this doesn't implement or extend from any interface or class and doesn't use jpa annotation
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private  int customerId; //Encapsulation
    private String customerName;
    private double customerSalary;
    private String customerAddress;
    private List<String> customerContactNumber;  //List implementation -ArrayList ,LinkedList,Vector, List<String> contactNumbers = new ArrayList<>();
    private String nic;
    private boolean activeStatus;


}
