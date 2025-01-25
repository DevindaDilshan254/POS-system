package com.myorganization.pos_system.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerUpdateDTO {
    private  int customerId; //Encapsulation
    private String customerName;
    private double customerSalary;
    private String customerAddress;

}
