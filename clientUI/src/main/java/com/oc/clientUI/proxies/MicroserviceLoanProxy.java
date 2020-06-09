package com.oc.clientUI.proxies;

import com.oc.clientUI.beans.LoanBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservice-Loans",url = "localhost:9003")
public interface MicroserviceLoanProxy {
    @GetMapping(value = "LoansSearch/{idUser}")
    List<LoanBean> findLoanByUser(@PathVariable Long idUser);

    @GetMapping(value = "Loans/{id}")
    LoanBean displayLoan(@PathVariable Long id);

    @PostMapping(value = "Loans")
    ResponseEntity<Void> addLoan(@RequestBody LoanBean loan);

    @GetMapping(value = "Loans")
    List<LoanBean> ListLoan();
}
