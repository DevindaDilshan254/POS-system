package com.myorganization.pos_system.entity;

import com.myorganization.pos_system.entity.enums.MeasuringUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    @Id
    @Column(name = "item_id",length = 45)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int itemId;

    @Column(name = "item_name",length = 100)
    private String itemName;

    @Enumerated(EnumType.STRING)
    @Column(name = "measuring_unit",length = 20)
    private MeasuringUnitType measuringUnit;

    @Column(name = "item_qty",length = 20)
    private double itemQty;

    @Column(name = "supplier_price",length = 20)
    private double supplierPrice;

    @Column(name = "selling_price",length = 20)
    private double sellingPrice;

    @Column(name = "active_status",columnDefinition ="TINYINT default 1") //1 and 0 are stored in the table
    private boolean activeStatus;

}
