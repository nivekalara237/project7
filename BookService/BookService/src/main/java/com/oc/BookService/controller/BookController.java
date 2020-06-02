package com.oc.BookService.controller;

import com.oc.BookService.dao.BookDao;
import com.oc.BookService.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping(value = "BooksSearch/{keyword}")
    public List<Book> findBookByKeyword(@PathVariable String keyword) {
        return bookDao.findByKeyword(keyword);
    }

    @GetMapping(value = "Books/{id}")
    public Optional<Book> displayBook(@PathVariable Long id) {
        return bookDao.findById(id);
    }

    @PostMapping(value = "Books")
    public ResponseEntity<Void> addBook(@RequestBody Book book){
        Book bookCheck = bookDao.save(book);
        if(bookCheck == null)
            return ResponseEntity.noContent().build();
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bookCheck.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping(value = "Books")
    public List<Book> ListBook(){
        return bookDao.findAll();
    }
}