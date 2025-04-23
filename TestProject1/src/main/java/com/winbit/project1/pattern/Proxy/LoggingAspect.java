package com.winbit.project1.pattern.Proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 프록시 패턴
// => 어떤 객체에 대한 접근을 제어하기 위해, 대리 객체(proxy)를 사용하는 패턴
// => Spring AOP는 프록시 패턴 기반으로 동작함. 핵심 로직 전후에 부가기능 삽입 가능

// 서비스 메서드 실행 전후에 로깅 예제(AOP)
@Aspect // 프록시 객체가 대상 객체의 메서드를 감싸는 구조
@Component
public class LoggingAspect {

	// 모든 Service 패키지의 메서드 실행 전
	@Before("execution(* com.winbit.project1.service.*.*(..))")
	public void beforeLog(JoinPoint joinPoint) {
		System.out.println("[Before]" + joinPoint.getSignature().getName()); //ex: [Before]getBoardList
	}
	
	// 실행 후
	@After("execution(* com.winbit.project1.service.*.*(..))")
	public void afterLog(JoinPoint joinPoint) {
		System.out.println("[After]" + joinPoint.getSignature().getName()); //ex: [After]getBoardList
	}
}
