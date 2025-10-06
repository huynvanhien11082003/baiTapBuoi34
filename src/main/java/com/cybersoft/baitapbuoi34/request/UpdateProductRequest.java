package com.cybersoft.baitapbuoi34.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateProductRequest {
    private String name;
    private int price;
    private String email;
}
