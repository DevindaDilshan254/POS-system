package com.myorganization.pos_system.controller;

import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.service.ITEM_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/item")
@RestController
public class ItemController {
    @Autowired
    ITEM_SERVICE item_service;

    @PostMapping
    public String saveItem(@RequestBody ItemRequestDTO itemRequestDTO){
        return item_service.saveItem(itemRequestDTO);

    }
}
