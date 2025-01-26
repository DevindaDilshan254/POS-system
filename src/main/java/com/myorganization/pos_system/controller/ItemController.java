package com.myorganization.pos_system.controller;

import com.myorganization.pos_system.dto.requestDTO.ItemRequestDTO;
import com.myorganization.pos_system.dto.responseDTO.ItemResponseDTO;
import com.myorganization.pos_system.dto.responseDTO.PaginatedItemResponseDTO;
import com.myorganization.pos_system.entity.Item;
import com.myorganization.pos_system.service.ITEM_SERVICE;
import com.myorganization.pos_system.util.StandardResponse;
import com.myorganization.pos_system.util.mappers.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/item")
@RestController
public class ItemController {
    @Autowired
    private ITEM_SERVICE item_service;

    @PostMapping("/save-item")
    public String saveItem(@RequestBody ItemRequestDTO itemRequestDTO) {
        return item_service.saveItem(itemRequestDTO);
    }

    @GetMapping("/get-items-if-item-is-active/{item-name}")
    public List<ItemResponseDTO> getItemsIfItemIsActive(@PathVariable(value = "item-name") String itemName) {
        return item_service.getItemsIfItemIsActive(itemName);
    }
    @GetMapping("/get-items-by-active-status/{active-status}/{page-number}/{page-size}")
    public ResponseEntity<StandardResponse> getAllItemsByActiveStatus(@PathVariable(value = "active-status") boolean activeStatus,
                                                                     @PathVariable(value = "page-number") int pageNumber,
                                                                     @PathVariable(value = "page-size") int pageSize) {
        //To create paginated object we need two values as pageNumber and pageSize
        PaginatedItemResponseDTO paginatedItemResponseDTO= item_service.getAllItemsByActiveStatus(activeStatus,pageNumber,pageSize);
        return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",paginatedItemResponseDTO), HttpStatus.FOUND);
    }
}
