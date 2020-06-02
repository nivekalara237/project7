package com.oc.LoanService.controller;


import com.oc.LoanService.dao.LoanDao;
import com.oc.LoanService.model.Loan;
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
        return loanDao.findByUser(idUser);
    }

    @GetMapping(value = "Loans/{id}")
    public Optional<Loan> displayLoan(@PathVariable Long id) {
        return loanDao.findById(id);
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
    @GetMapping(value = "Loans")
    public List<Loan> ListLoan(){
        return loanDao.findAll();
    }
}