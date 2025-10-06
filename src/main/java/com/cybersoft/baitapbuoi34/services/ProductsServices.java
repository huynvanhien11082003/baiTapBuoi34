package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.entity.Products;
import com.cybersoft.baitapbuoi34.request.InsertProductRequest;
import com.cybersoft.baitapbuoi34.request.UpdateProductRequest;

import java.util.List;
import java.util.Optional;

public interface ProductsServices {
    List<Products> getAllProducts();
    public boolean insertProducts(InsertProductRequest insertProductRequest);
    public Optional<Products> getProductsById(Integer id);
    public boolean updateProductsById(Integer id, UpdateProductRequest updateProductRequest);
    public boolean deleteProductsById(Integer id);

}
