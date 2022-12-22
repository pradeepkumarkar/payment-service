package com.microservice.payment.paymentservice.repository;

import com.microservice.payment.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
