package com.oc.clientUI.controller;

import com.oc.clientUI.beans.BookBean;
import com.oc.clientUI.proxies.MicroserviceBookProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    MicroserviceBookProxy microserviceBookProxy;

    @GetMapping(name = "/")
    public String homepage(Model model){
        List<BookBean> books = microserviceBookProxy.findBookByKeyword("le");
        model.addAttribute("books",books);
        return "Homepage";
    }
}
