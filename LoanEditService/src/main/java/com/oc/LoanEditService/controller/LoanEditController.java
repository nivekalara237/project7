package com.oc.LoanEditService.controller;

import com.oc.LoanEditService.dao.LoanDao;
import com.oc.LoanEditService.exceptions.LoanNotFoundException;
import com.oc.LoanEditService.model.Loan;
import com.oc.LoanEditService.service.ExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LoanEditController {
    @Autowired
    private LoanDao loanDao;
    @Autowired
    ExtensionService extensionService;

    @PostMapping(value = "Loan/{id}")
    public void addExtension(@PathVariable Long id){
        Optional<Loan> loan= loanDao.findById(id);
        if(!loan.isPresent()) throw new LoanNotFoundException("Le pret avec l'id "+id+" n'existe pas.");
        extensionService.addExtension(loan.get());
        Loan loanCheck = loanDao.save(loan.get());
    }

}
