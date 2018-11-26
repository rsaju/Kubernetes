package com.Kubernetes.servicetwo.controllers;

import com.Kubernetes.servicetwo.InterCommunication.ServiceCallClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Autowired
    private ServiceCallClient serviceCallClient;

    @GetMapping("boom")
    public String serviceTwo(){
        return "Service-two";
    }

    @GetMapping("call-service")
    public String callService(){
        return serviceCallClient.helloService();
    }
}
