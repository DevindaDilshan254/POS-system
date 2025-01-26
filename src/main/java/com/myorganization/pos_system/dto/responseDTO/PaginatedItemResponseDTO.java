package com.myorganization.pos_system.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PaginatedItemResponseDTO {
    List<ItemResponseDTO> itemResponseDTOList;
    int allNumberOfData;

}
