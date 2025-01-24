package com.myorganization.pos_system.service.serviceIMPL;
import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.dto.responseDTO.ItemResponseDTO;
import com.myorganization.pos_system.entity.Item;
import com.myorganization.pos_system.repository.ITEM_REPO;
import com.myorganization.pos_system.service.ITEM_SERVICE;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements ITEM_SERVICE {
    @Autowired
    private ITEM_REPO item_repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveItem(ItemRequestDTO itemRequestDTO) {
        Item item = modelMapper.map(itemRequestDTO, Item.class);//entity created
        if (!item_repo.existsById(item.getItemId())) {
            item_repo.save(item);
            return item.getItemName() + " saved successfully";
        } else {
            throw new DuplicateKeyException("item is already exist");
        }
    }

    @Override
    public List<ItemResponseDTO> getItemsIfItemIsActive(String itemName) {
        List<Item> items=item_repo.getAllByItemNameAndActiveStatusEquals(itemName,true);
        if(items.size()>0){
            List<ItemResponseDTO> itemResponseDTOS=modelMapper.map(items,new TypeToken<List<ItemResponseDTO>>(){}.getType());
            return itemResponseDTOS;
        }else{
            throw new RuntimeException("not active items found");
        }
    }
}