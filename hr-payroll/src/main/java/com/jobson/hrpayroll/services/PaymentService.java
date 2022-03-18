package com.jobson.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jobson.hrpayroll.entities.Payment;
import com.jobson.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVaribles = new HashMap<>();
		uriVaribles.put("id", ""+workerId);
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVaribles);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
