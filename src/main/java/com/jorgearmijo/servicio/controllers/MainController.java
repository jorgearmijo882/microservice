package com.jorgearmijo.servicio.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jorgearmijo.servicio.models.Customer;

@RestController
public class MainController {
    @PostMapping(path = "/DevOps")
    public String customerInformation(@RequestBody Customer cust) {

        return "message:" + " " + cust.getTo() + " " + "your message will be send";
    }
}
