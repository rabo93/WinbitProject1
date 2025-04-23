package com.winbit.project1.pattern.Singleton;

// 싱글톤 패턴 예제
public class CarClass {
	
	// 자신을 멤버로 선언해서 메모리 올려 놓는다(static)
	private static CarClass car = new CarClass(); 
	
	// 외부에서 멤버로 선언된 car를 가져올 수 있는 메소드를 만들어
	// getInstance 메서드 외에는 CarClass 객체를 생성하거나 사용할 수 없게 된다.
	// => 해당 car 객체를 누군가 이용한다면 이용을 못한다.(싱글톤 패턴)
	public static CarClass getInstance() {
		return car;
	}
	
	
	
}
