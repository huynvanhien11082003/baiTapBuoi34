package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Book;
import com.cybersoft.baitapbuoi34.repository.BookRepository;
import com.cybersoft.baitapbuoi34.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServicesImp implements BookServices {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getBooksByName(String name) {
        return bookRepository.findByAuthorContainingIgnoreCase(name);
    }

    @Override
    public List<Book> getBooksByPrice(Double minPrice, Double maxPrice) {
        return bookRepository.findByPriceBetween(minPrice, maxPrice);
    }
}
