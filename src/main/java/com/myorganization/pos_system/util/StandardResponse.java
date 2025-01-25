package com.myorganization.pos_system.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardResponse {
    private int statusCode;
    private String responseMessage;
    private Object responseData;
}
