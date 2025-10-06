package com.cybersoft.baitapbuoi34.repository;

import com.cybersoft.baitapbuoi34.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByPriceBetween(double priceAfter, double priceBefore);
}
