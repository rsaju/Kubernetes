package com.Kubernetes.servicetwo.InterCommunication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="service-one", url = "http://service-one:8081")
public interface ServiceCallClient {

    @RequestMapping(method= RequestMethod.GET, value = "/hello")
    public String helloService();
}
