package com.winbit.project1.pattern.Strategy;

import java.util.Map;

import org.springframework.stereotype.Service;

// 3. 전략을 map으로 주입받아 동적으로 사용
@Service
public class PaymentService {
	//의존성 추가
	private final Map<String, PaymentStrategy> strategyMap;
	
	// 모든 PaymanetStrategy Bean이 주입됨 (key = @Component("name"))
	public PaymentService(Map<String, PaymentStrategy> strategyMap) {
		this.strategyMap = strategyMap;
	}
	
	public void pay(String method, int amount) {
		PaymentStrategy strategy = strategyMap.get(method); // ex: "card", "kakao"
		strategy.pay(amount); // 전략에 따라 실행
	}
	
}
