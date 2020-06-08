package com.oc.BookService.controller;

import com.oc.BookService.dao.BookDao;
import com.oc.BookService.exceptions.BookNotFoundException;
import com.oc.BookService.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping(value = "BooksSearch/{keyword}")
    public List<Book> findBookByKeyword(@PathVariable String keyword) throws BookNotFoundException {
        List<Book> bookList = bookDao.findByKeyword(keyword);
        if( bookList.isEmpty()) throw new BookNotFoundException("Aucun ouvrage avec la recherche "+keyword+" n'a été trouvé.");
        return bookList;
    }

    @GetMapping(value = "Books/{id}")
    public Optional<Book> displayBook(@PathVariable Long id) throws BookNotFoundException {
        Optional<Book> book = bookDao.findById(id);
        if( !book.isPresent()) throw new BookNotFoundException("L'ouvrage avec l'id "+id+" n'existe pas.");
        return book;
    }

    @PostMapping(value = "Books")
    public ResponseEntity<Void> addBook(@Valid @RequestBody Book book){
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
        List<Book> bookList = bookDao.findAll();
        if( bookList.isEmpty()) throw new BookNotFoundException("Aucun ouvrage n'a été trouvé.");
        return bookList;
    }
}