package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Category;
import com.cybersoft.baitapbuoi34.repository.CategoryRepository;
import com.cybersoft.baitapbuoi34.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicesImp implements CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public boolean createCategory(Category category) {
        categoryRepository.save(category);

        return true;
    }
}
