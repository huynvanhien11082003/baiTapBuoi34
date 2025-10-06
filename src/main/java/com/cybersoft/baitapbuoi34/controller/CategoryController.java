package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.dto.ProductCategoryDTO;
import com.cybersoft.baitapbuoi34.entity.Category;
import com.cybersoft.baitapbuoi34.entity.ProductCategory;
import com.cybersoft.baitapbuoi34.services.CategoryServices;
import com.cybersoft.baitapbuoi34.services.imp.CategoryServicesImp;
import com.cybersoft.baitapbuoi34.services.imp.ProductsCategoryServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryServicesImp categoryServicesImp;

    @Autowired
    private ProductsCategoryServicesImp productsCategoryServicesImp;
    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        categoryServicesImp.createCategory(category);
        return ResponseEntity.ok("Tạo thành công category");
    }
    @PostMapping("{id}/products")
    public ResponseEntity<?> addProductCategory(@PathVariable Integer id, @RequestBody ProductCategory productCategory){
        productsCategoryServicesImp.addProductCategory(id,productCategory);
        return ResponseEntity.ok("Thêm product vào category thành công");
    }
    @GetMapping("{id}/products")
    public ResponseEntity<?> getProductCategory(@PathVariable Integer id){
        List<ProductCategoryDTO> productCategoryList = productsCategoryServicesImp.getProductCategoryById(id);
        return ResponseEntity.ok(productCategoryList);
    }
}
