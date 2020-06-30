package com.oc.LoanService.controller;


import com.oc.LoanService.dao.LoanDao;
import com.oc.LoanService.exceptions.LoanNotFoundException;
import com.oc.LoanService.model.Loan;
import com.oc.LoanService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
public class LoanController {
    @Autowired
    private LoanDao loanDao;

    @GetMapping(value = "LoansSearch/{idUser}")
    public List<Loan> findLoanByUser(@PathVariable Long idUser) {
        List<Loan> loanList = loanDao.findByUser(idUser);
        if(loanList.isEmpty()) throw new LoanNotFoundException("Aucun prêt pour l'utilisateur "+ idUser +" n'a été trouvé.");
        return loanList;
    }

    @GetMapping(value = "Loans/{id}")
    public Optional<Loan> displayLoan(@PathVariable Long id) {
        Optional<Loan> loan = loanDao.findById(id);
        if (!loan.isPresent()) throw new LoanNotFoundException("Le pret avec l'id "+id+" n'existe pas.");
        return loan;
    }

    @PostMapping(value = "Loans")
    public ResponseEntity<Void> addLoan(@RequestBody Loan loan){
        Loan loanCheck = loanDao.save(loan);
        if(loanCheck == null)
            return ResponseEntity.noContent().build();
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(loanCheck.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
//    @GetMapping(value = "Loans")
//    public List<Loan> ListLoan(){
//        System.out.println("test");
//        List<Loan> loanList = loanDao.findAll();
//        System.out.println("test1");
//        if(loanList.isEmpty()) throw new LoanNotFoundException("Aucun prêt n'a été trouvé.");
//        System.out.println("test2");
//        return loanList;
//    }
}