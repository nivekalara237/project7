package com.oc.microservice.controller;

import com.oc.microservice.dao.BookDao;
import com.oc.microservice.dao.LoanDao;
import com.oc.microservice.exceptions.LoanNotFoundException;
import com.oc.microservice.model.Book;
import com.oc.microservice.model.Loan;
import com.oc.microservice.model.User;
import com.oc.microservice.service.ExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
public class LoanController {
    @Autowired
    private LoanDao loanDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private ExtensionService extensionService;

    @PostMapping(value = "LoansSearch")
    public List<Loan> findLoanByUser(@RequestBody Long idUser) {
        List<Loan> loanList = loanDao.findByUser(idUser);
        //if(loanList.isEmpty()) throw new LoanNotFoundException("Aucun prêt pour l'utilisateur "+ idUser +" n'a été trouvé.");
        return loanList;
    }

    @GetMapping(value = "Loans/{id}")
    public Optional<Loan> displayLoan(@PathVariable Long id) {
        Optional<Loan> loan = loanDao.findById(id);
        //if (!loan.isPresent()) throw new LoanNotFoundException("Le pret avec l'id "+id+" n'existe pas.");
        return loan;
    }


    @RequestMapping(value = "/createLoan/{id}", method = RequestMethod.GET)
    public String createLoan(@PathVariable(name = "id") Long id,User user) {
        Book book = bookDao.getOne(id);
        if(book.getNbRemaining() == 0){
            return "redirect:/";
        }
        book.setNbRemaining(book.getNbRemaining()-1);
        Loan loan = new Loan();
        loan.setReturned(false);
        loan.setBook(book);
        loan.setUser(user);
        loan.setDateStart(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        loan.setExtension(false);
        loan.setDateEnd(extensionService.addDate(loan.getDateStart()));
        loanDao.save(loan);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteLoan/{id}")
    public String deleteLoan(@PathVariable(name = "id") Long id) {
        loanDao.deleteById(id);
        return "redirect:/";
    }



    @GetMapping(value = "Loans")
    public List<Loan> ListLoan(){
        List<Loan> loanList = loanDao.findAll();
        //if(loanList.isEmpty()) throw new LoanNotFoundException("Aucun prêt n'a été trouvé.");
        return loanList;
    }
    @PostMapping(value = "Loan/{id}")
    public void addExtension(@PathVariable Long id){
        Optional<Loan> loan= loanDao.findById(id);
        //if(!loan.isPresent()) throw new LoanNotFoundException("Le pret avec l'id "+id+" n'existe pas.");
        extensionService.addExtension(loan.get());
        loanDao.save(loan.get());
    }
}