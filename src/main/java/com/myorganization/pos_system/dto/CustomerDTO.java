package com.myorganization.pos_system.dto;

import java.util.List;

// Customer class is a pojo -plain old java object ,this doesn't implement or extend from any interface or class and doesn't use jpa annotation
public class CustomerDTO {
    private  int customerId; //Encapsulation
    private String customerName;
    private double customerSalary;
    private String customerAddress;
    private List<String> customerContactNumber;  //List implementation -ArrayList ,LinkedList,Vector, List<String> contactNumbers = new ArrayList<>();
    private String nic;
    private boolean activeStatus;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, double customerSalary, String customerAddress, List<String> customerContactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSalary = customerSalary;
        this.customerAddress = customerAddress;
        this.customerContactNumber = customerContactNumber;
        this.nic = nic;
        this.activeStatus = active;
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

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
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
                ", active=" + activeStatus +
                '}';
    }
}
