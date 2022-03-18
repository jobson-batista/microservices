package com.jobson.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jobson.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Jobson", 200.0, days);
	}
}
