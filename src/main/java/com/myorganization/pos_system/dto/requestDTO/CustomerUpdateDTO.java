package com.myorganization.pos_system.dto.requestDTO;

import java.util.List;

public class CustomerUpdateDTO {
    private  int customerId; //Encapsulation
    private String customerName;
    private double customerSalary;
    private String customerAddress;

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(int customerId, String customerName, double customerSalary, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSalary = customerSalary;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerSalary=" + customerSalary +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
