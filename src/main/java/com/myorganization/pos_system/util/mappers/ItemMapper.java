package com.myorganization.pos_system.util.mappers;

import com.myorganization.pos_system.dto.responseDTO.ItemResponseDTO;
import com.myorganization.pos_system.entity.Item;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    List<ItemResponseDTO> itemEntityListToItemResponseDTOList(List<Item> items);
    List<ItemResponseDTO> itemPageToItemResponseDTOList(Page<Item> itemPage);
}
