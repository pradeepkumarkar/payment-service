package com.microservice.payment.paymentservice.controller;

import com.microservice.payment.paymentservice.dto.PaymentRequest;
import com.microservice.payment.paymentservice.entity.Payment;
import com.microservice.payment.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping()
    public Payment doPayment(@RequestBody PaymentRequest paymentRequest){
        return paymentService.payment(paymentRequest);
    }


}
