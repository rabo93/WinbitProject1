package com.winbit.project1.pattern.TemplateMethod;

// 팩토리 메서드 패턴
// : 객체 생성을 서브클래스에 맡기고, 클라이언트 타입만 지정
public class FactoryMethod {
	public static void main(String[] args) {
		Notification noti = NotificationFactory.create("email");
		noti.send("Hello, Factory!");
		
	}
}

//알림(Notification) 인터페이스 => 클라이언트 타입만 지정
interface Notification {
	void send(String message);
	
}

class EmailNotification implements Notification {
	public void send(String message) {
		System.out.println("Email: " + message);
	}
}

class SmsNotification implements Notification {
	public void send(String message) {
		System.out.println("SMS: " + message);
	}
}

//알림(NotificationFactory) 서브 클래스 => 객체 생성
class NotificationFactory {
	public static Notification create(String type) {
		return switch(type) {
			case "email" -> new EmailNotification();
			case "sms" -> new SmsNotification();
			default -> throw new IllegalArgumentException("Unexpected value: " + type);
		};
	}
}