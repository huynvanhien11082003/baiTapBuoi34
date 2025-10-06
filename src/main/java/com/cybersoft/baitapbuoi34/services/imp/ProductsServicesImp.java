package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Products;
import com.cybersoft.baitapbuoi34.repository.ProductsRepository;
import com.cybersoft.baitapbuoi34.request.InsertProductRequest;
import com.cybersoft.baitapbuoi34.request.UpdateProductRequest;
import com.cybersoft.baitapbuoi34.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsServicesImp implements ProductsServices {


    @Autowired
    private ProductsRepository productsRepository;
    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public boolean insertProducts(InsertProductRequest insertProductRequest) {
        Products products = new Products();
        products.setName(insertProductRequest.getName());
        products.setPrice(insertProductRequest.getPrice());
        products.setEmail(insertProductRequest.getEmail());
        Products productsInsert = productsRepository.save(products);

        return true;
    }

    @Override
    public Optional<Products> getProductsById(Integer id) {
        Optional<Products> products = productsRepository.findById(id);
        if(products.isPresent()){
            return products;
        }
        return null;
    }

    @Override
    public boolean updateProductsById(Integer id, UpdateProductRequest updateProductRequest) {
        Optional<Products> products = productsRepository.findById(id);
        if(products.isPresent()){
            Products productsUpdate = products.get();
            productsUpdate.setName(updateProductRequest.getName());
            productsUpdate.setPrice(updateProductRequest.getPrice());
            productsUpdate.setEmail(updateProductRequest.getEmail());
            productsRepository.save(productsUpdate);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProductsById(Integer id) {
        Optional<Products> products = productsRepository.findById(id);
        if(products.isPresent()){
            Products productsDelete = products.get();
            productsRepository.delete(productsDelete);
            return true;
        }
        return false;
    }
}
