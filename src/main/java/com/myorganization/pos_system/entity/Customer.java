package com.myorganization.pos_system.entity;
import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_table")
@TypeDef(name="json",typeClass = JsonType.class) //need hibernate type-5 dependency + org.springframework.boot-version 2.7.14
public class Customer {

    @Id
    @Column(name = "cus_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int customerId; //Encapsulation

    @Column(name = "cus_name",length = 100,nullable = false)
    private String customerName;

    @Column(name = "cus_salary")
    private double customerSalary;

    @Column(name = "cus_address",length = 200)
    private String customerAddress;

    @Type(type="json")
    @Column(name = "cus_contact_num",columnDefinition = "json")
    private List<String> customerContactNumber;  //List implementation -ArrayList ,LinkedList,Vector, List<String> contactNumbers = new ArrayList<>();

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_status",columnDefinition ="TINYINT default 1"/*CREATE TABLE customer_table (active_status TINYINT DEFAULT 1) */)            //TINYINT is datatype that represent small integer
    private boolean activeStatus;

    public Customer() {
    }

    public Customer(int customerId, String customerName, double customerSalary, String customerAddress, List<String> customerContactNumber, String nic, boolean active) {
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
        return "Customer{" +
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
