package com.myorganization.pos_system.controller;

import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.dto.responseDTO.ItemResponseDTO;
import com.myorganization.pos_system.service.ITEM_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/item")
@RestController
public class ItemController {
    @Autowired
    private ITEM_SERVICE item_service;

    @PostMapping("/save-item")
    public String saveItem(@RequestBody ItemRequestDTO itemRequestDTO){
        return item_service.saveItem(itemRequestDTO);
    }

    @GetMapping("/get-items-if-item-is-active/{item-name}")
    public List<ItemResponseDTO> getItemsIfItemIsActive(@PathVariable(value = "item-name") String itemName){
        return item_service.getItemsIfItemIsActive(itemName);
    }
}
