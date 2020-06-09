package com.oc.clientUI.proxies;

import com.oc.clientUI.beans.BookBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@FeignClient(name = "microservice-books",url = "localhost:9090")
public interface MicroserviceBookProxy {
    @GetMapping(value = "/BooksSearch/{keyword}")
    List<BookBean> findBookByKeyword(@PathVariable("keyword") String keyword);

    @GetMapping(value = "/Books/{id}")
    BookBean displayBook(@PathVariable("id") Long id);
/*
    @PostMapping(value = "Books")
    ResponseEntity<Void> addBook(@Valid @RequestBody Book book);

    @GetMapping(value = "Books")
    List<Book> ListBook();*/
}
