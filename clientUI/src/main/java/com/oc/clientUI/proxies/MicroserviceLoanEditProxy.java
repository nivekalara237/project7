package com.oc.clientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "microservice-LoansEdit",url = "localhost:9002")
public interface MicroserviceLoanEditProxy {
    @PostMapping(value = "Loan/{id}")
    void addExtension(@PathVariable Long id);
}
