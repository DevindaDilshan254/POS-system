package com.myorganization.pos_system.dto.requestDTO;
import com.myorganization.pos_system.entity.enums.MeasuringUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemRequestDTO {
    private String itemName;
    private MeasuringUnitType measuringUnit;
    private double itemQty;
    private double supplierPrice;
    private double sellingPrice;

}
