package com.oc.clientUI.proxies;

import com.oc.clientUI.beans.BookBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "microservice-books",url = "localhost:9001")
public interface MicroserviceBookProxy {
    @GetMapping(value = "/BooksSearch/{keyword}")
    List<BookBean> findBookByKeyword(@PathVariable("keyword") String keyword);

    @GetMapping(value = "/Books/{id}")
    BookBean displayBook(@PathVariable("id") Long id);

    @PostMapping(value = "Books")
    ResponseEntity<Void> addBook(@Valid @RequestBody BookBean book);

    @GetMapping(value = "Books")
    List<BookBean> ListBook();
}
