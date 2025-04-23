package com.winbit.project1.pattern.Strategy;

import org.springframework.stereotype.Component;

// 전략 패턴
// => 런타임 시점에 알고리즘(전략)을 교체할 수 있도록 해줌
// => Spring에서는 인터페이스 구현체들을 Bean으로 등록하고 Map으로 주입받아 유연하게 처리


// 결제방식 선택 예제
// 1. 전략 인터페이스 정의
public interface PaymentStrategy {
	void pay(int amount);
}


// 2. 전략 구현체들 (@Component로 Bean등록)
@Component("card") // key값이 된다 (Map 주입 시)
class CardPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Card로 " + amount + "원 결제");
	}
	
}
@Component("Kakao")
class KakaoPay implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Kakao pay로 " + amount + "원 결제");
	}
}


