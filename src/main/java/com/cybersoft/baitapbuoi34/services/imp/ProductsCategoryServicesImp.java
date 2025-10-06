package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.dto.CategoryDTO;
import com.cybersoft.baitapbuoi34.dto.ProductCategoryDTO;
import com.cybersoft.baitapbuoi34.entity.Category;
import com.cybersoft.baitapbuoi34.entity.ProductCategory;
import com.cybersoft.baitapbuoi34.repository.CategoryRepository;
import com.cybersoft.baitapbuoi34.repository.ProductCategoryRepository;
import com.cybersoft.baitapbuoi34.services.ProductsCategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsCategoryServicesImp implements ProductsCategoryServices {


    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public boolean addProductCategory(Integer id, ProductCategory productCategory) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()){
            productCategory.setCategory(category.get());
            productCategoryRepository.save(productCategory);
            return true;
        }

        return false;
    }

    @Override
    public List<ProductCategoryDTO> getProductCategoryById(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()){
            Category categoryNew = category.get();
            return categoryRepository.findAll().stream().map(item->{
                ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();
                productCategoryDTO.setId(item.getId());
                productCategoryDTO.setName(item.getName());

                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setId(categoryNew.getId());
                categoryDTO.setName(categoryNew.getName());

                productCategoryDTO.setCategory(categoryDTO);
                return productCategoryDTO;
            }).toList();
        }
        return null;
    }
}
