package com.cybersoft.baitapbuoi34.respone;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class BaseResponse {
    private int code;
    private String message;
    private Object data;
}
