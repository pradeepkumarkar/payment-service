package com.microservice.payment.paymentservice.service;

import com.microservice.payment.paymentservice.dto.PaymentRequest;
import com.microservice.payment.paymentservice.entity.Payment;
import com.microservice.payment.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment payment(PaymentRequest paymentRequest ){

        Payment payment = new Payment();
        payment.setAmount(paymentRequest.amount());
        payment.setOrderId(paymentRequest.orderId());
        payment.setTransactionId(UUID.randomUUID().toString());
        //Call third party payment service here
        payment.setPaymentStatus(new Random().nextBoolean() ? "SUCCESS" : "FAILED");
        payment = paymentRepository.save(payment);
        return payment;
    }

}
