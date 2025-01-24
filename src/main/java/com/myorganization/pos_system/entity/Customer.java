package com.myorganization.pos_system.entity;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_table")
@TypeDef(name="json",typeClass = JsonType.class) //need hibernate type-5 dependency + org.springframework.boot-version 2.7.14
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
