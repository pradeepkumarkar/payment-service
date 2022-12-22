package com.microservice.payment.paymentservice.dto;

public record PaymentRequest (int orderId, double amount){
}
