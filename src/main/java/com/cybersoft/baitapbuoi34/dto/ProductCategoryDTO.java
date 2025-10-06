package com.cybersoft.baitapbuoi34.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductCategoryDTO {
    private int id;
    private String name;
    private CategoryDTO category;
}
