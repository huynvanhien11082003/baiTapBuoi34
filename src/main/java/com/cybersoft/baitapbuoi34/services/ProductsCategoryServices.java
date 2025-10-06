package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.dto.ProductCategoryDTO;
import com.cybersoft.baitapbuoi34.entity.ProductCategory;

import java.util.List;

public interface ProductsCategoryServices {
    public boolean addProductCategory(Integer id, ProductCategory productCategory);
    List<ProductCategoryDTO> getProductCategoryById(Integer id);
}
