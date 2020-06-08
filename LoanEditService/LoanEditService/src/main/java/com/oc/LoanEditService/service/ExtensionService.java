package com.oc.LoanEditService.service;

import com.oc.LoanEditService.model.Loan;
import org.springframework.stereotype.Service;

@Service
public class ExtensionService {
    private final static int NB_MAX_EXTENSION_DAY = 28;
    public void addExtension(Loan loan,int nbDay){
        if(loan.getNbExtension()+nbDay <= NB_MAX_EXTENSION_DAY)
            loan.setNbExtension(loan.getNbExtension()+nbDay);
    }
}
