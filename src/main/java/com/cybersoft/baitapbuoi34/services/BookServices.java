package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.entity.Book;

import java.util.List;

public interface BookServices {
    public List<Book> getBooksByName(String name);

    public List<Book> getBooksByPrice(Double minPrice, Double maxPrice);
}
