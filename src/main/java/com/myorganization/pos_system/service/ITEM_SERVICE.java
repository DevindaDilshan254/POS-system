package com.myorganization.pos_system.service;

import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.dto.responseDTO.ItemResponseDTO;
import com.myorganization.pos_system.dto.responseDTO.PaginatedItemResponseDTO;
import com.myorganization.pos_system.entity.Item;

import java.util.List;

public interface ITEM_SERVICE {

    String saveItem(ItemRequestDTO itemRequestDTO);
    List<ItemResponseDTO> getItemsIfItemIsActive(String itemName);
    PaginatedItemResponseDTO getAllItemsByActiveStatus(boolean activeStatus, int pageNumber, int pageSize);
}
