package com.oc.clientUI.controller;

import com.oc.clientUI.beans.BookBean;
import com.oc.clientUI.beans.LoanBean;
import com.oc.clientUI.beans.UserBean;
import com.oc.clientUI.proxies.MicroserviceBookProxy;
import com.oc.clientUI.proxies.MicroserviceLoanEditProxy;
import com.oc.clientUI.proxies.MicroserviceLoanProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@Controller
public class ClientController {
    @Autowired
    MicroserviceBookProxy microserviceBookProxy;
    @Autowired
    MicroserviceLoanProxy microserviceLoanProxy;
    @Autowired
    MicroserviceLoanEditProxy microserviceLoanEditProxy;

    @GetMapping(name = "/")
    public String homepage(Model model){
        // -- Utilisation d'un utilisateur --
        UserBean user = new UserBean();
        user.setId((long) 1);
        user.setFirstname("Geoffrey");
        user.setName("D.");
        user.setMail("dg@gmail.com");
        user.setUsername("test");
        user.setPassword("123");
        // **************************************** Test des fonctionnalité de bookService *********************************************************
//        List<BookBean> books = microserviceBookProxy.findBookByKeyword("le");
//        BookBean books1 = microserviceBookProxy.displayBook((long) 2);
//        /* test d'ajout */
//        BookBean book = new BookBean();
//        book.setAutor("Jean-luc");
//        book.setNbRemaining(5);
//        book.setTitle("Le voyage de Jean");
//        book.setNbTotal(7);
//        microserviceBookProxy.addBook(book);
        List<BookBean> books2 = microserviceBookProxy.ListBook();

        model.addAttribute("books",books2);
        // **************************************** Test des fonctionnalité de LoanService *********************************************************
//        List<LoanBean> loans = microserviceLoanProxy.findLoanByUser(user.getId());
//        List<LoanBean> loans1 = microserviceLoanProxy.ListLoan();
//        LoanBean loan = microserviceLoanProxy.displayLoan((long) 3);
        /* Test d'ajout */
//        LoanBean loan1 = new LoanBean();
//        loan1.setIdBook((long)2);
//        loan1.setIdUser((long)1);
//        loan1.setDateStart(new Date(32));
//        loan1.setNbExtension(0);
//        loan1.setReturned(false);
//        microserviceLoanProxy.addLoan(loan1);
        // **************************************** Test des fonctionnalité de LoanEditService *********************************************************

//        microserviceLoanEditProxy.addExtension((long)2);
        return "Homepage";
    }
    @GetMapping("book/{id}")
    public ModelAndView showBookPage(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("book");
        BookBean book = microserviceBookProxy.displayBook(id);
        modelAndView.addObject("book",book);
        return modelAndView;
    }

}
