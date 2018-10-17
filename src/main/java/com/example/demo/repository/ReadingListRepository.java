package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
