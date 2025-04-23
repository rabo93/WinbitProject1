package com.winbit.project1.pattern.Strategy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	// 의존성 추가
	private final PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}	
	
	// ex) /pay?method=card&amount=10000
	@PostMapping("/pay")
	public String pay(@RequestParam String method, @RequestParam int amount) {
		paymentService.pay(method, amount);
		return "결제완료";
	}
	
}
