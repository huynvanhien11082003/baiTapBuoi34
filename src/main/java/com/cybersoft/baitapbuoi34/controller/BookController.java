package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.entity.Book;
import com.cybersoft.baitapbuoi34.services.imp.BookServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServicesImp  bookServicesImp;
    @GetMapping("/search")
    public ResponseEntity<?> getBooksByAuthor(@RequestParam String author){
        List<Book> bookList = bookServicesImp.getBooksByName(author);
        return ResponseEntity.ok(bookList);
    }
    @GetMapping("/filter")
    public ResponseEntity<?> getBookByPrice(@RequestParam Double minPrice, @RequestParam Double maxPrice){
        List<Book> bookList = bookServicesImp.getBooksByPrice(minPrice, maxPrice);
        return ResponseEntity.ok(bookList);
    }
}
