package com.myorganization.pos_system.service.serviceIMPL;

import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.entity.Item;
import com.myorganization.pos_system.repository.ITEM_REPO;
import com.myorganization.pos_system.service.ITEM_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements ITEM_SERVICE {
    @Autowired
    ITEM_REPO item_repo;


    @Override
    public String saveItem(ItemRequestDTO itemRequestDTO) {
        Item item =new Item(1,
                itemRequestDTO.getItemName(),
                itemRequestDTO.getMeasuringUnit(),
                itemRequestDTO.getItemQty(),
                itemRequestDTO.getSupplierPrice(),
                itemRequestDTO.getSellingPrice(),
                true);
        item_repo.save(item);
        return "saved";
    }
}
