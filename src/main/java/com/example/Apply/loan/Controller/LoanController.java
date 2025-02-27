package com.example.Apply.loan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/loan")

public class LoanController {
    @Autowired

    private RestTemplate restTemplate;


    @GetMapping("/disburse")
    public String applyLoan()
    {

        String mpesaResponse =restTemplate.getForObject("http://localhost:8081/mpesa/disburse", String.class);
        return mpesaResponse;
    }


}
