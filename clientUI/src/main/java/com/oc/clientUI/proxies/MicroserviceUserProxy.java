package com.oc.clientUI.proxies;

import com.oc.clientUI.beans.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-users",url = "localhost:9005")
public interface MicroserviceUserProxy {
    @GetMapping(value = "User/{username}")
    UserBean findByUsername(@PathVariable String username);
}
