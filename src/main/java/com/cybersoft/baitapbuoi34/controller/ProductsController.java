package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.entity.Products;
import com.cybersoft.baitapbuoi34.repository.ProductsRepository;
import com.cybersoft.baitapbuoi34.request.InsertProductRequest;
import com.cybersoft.baitapbuoi34.request.UpdateProductRequest;
import com.cybersoft.baitapbuoi34.respone.BaseResponse;
import com.cybersoft.baitapbuoi34.services.imp.ProductsServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsServicesImp productsServicesImp;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        List<Products> allProducts = productsServicesImp.getAllProducts();

        return ResponseEntity.ok(allProducts);
    }
    @PostMapping
    public ResponseEntity<?> insertProducts(@RequestBody InsertProductRequest insertProductRequest){
        productsServicesImp.insertProducts(insertProductRequest);
        return ResponseEntity.ok("Thêm sản phẩm thành công");
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getProductsById(@PathVariable Integer id){
        BaseResponse response = new BaseResponse();
        response.setCode(HttpStatus.OK.value());
        response.setData(productsServicesImp.getProductsById(id));
        return ResponseEntity.ok(response);
    }
    @PutMapping("{id}")
    public ResponseEntity<?> updateProductsById(@PathVariable Integer id,@RequestBody UpdateProductRequest updateProductRequest){
        productsServicesImp.updateProductsById(id,updateProductRequest);
        return ResponseEntity.ok("Cập nhật sản phẩm bằng id thành công");
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?>  deleteProductsById(@PathVariable Integer id){
        productsServicesImp.deleteProductsById(id);
        return ResponseEntity.ok("Xóa sản phẩm bằng id thành công");
    }
}
