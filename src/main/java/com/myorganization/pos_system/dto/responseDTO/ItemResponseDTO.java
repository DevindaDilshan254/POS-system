package com.myorganization.pos_system.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemResponseDTO {
    private int itemId;
    private String itemName;
    private double itemQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeStatus;

}
