package com.myorganization.pos_system.dto;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import java.util.List;

public class CustomerDTO {
    private  int customerId; //Encapsulation
    private String customerName;
    private double customerSalary;
    private String customerAddress;
    private List<String> customerContactNumber;  //List implementation -ArrayList ,LinkedList,Vector, List<String> contactNumbers = new ArrayList<>();
    private String nic;
    private boolean active;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, double customerSalary, String customerAddress, List<String> customerContactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSalary = customerSalary;
        this.customerAddress = customerAddress;
        this.customerContactNumber = customerContactNumber;
        this.nic = nic;
        this.active = active;
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

    public List<String> getCustomerContactNumber() {
        return customerContactNumber;
    }

    public void setCustomerContactNumber(List<String> customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerSalary=" + customerSalary +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerContactNumber=" + customerContactNumber +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
