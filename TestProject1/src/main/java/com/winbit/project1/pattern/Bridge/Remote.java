// 브리지 패턴 예제
/*
 *	 		리모컨 ----------------------------> 디바이스
 * 			/    \							    /    |    \
 *  일반리모콘   스마트리모콘				  TV   라디오  컴퓨터
 * 
 * 리모콘은 어떤 디바이스가 오든 상관 없음. 그저 전원을 켜고 끄는 역할
 * 디바이스는 어떤 리모콘이 오든 상관 없음. 신호가 오면 전원을 키거나 끄도록 하면 됨
 * => 리모콘은 디바이스를 의존하고 있어야 어떤 디바이스에 신호를 보낼지 결정할 수 있음.
 *    따라서, 리모콘이 디바이스를 의존하는 것을 다리로 표현한 것이 브리지 패턴!
 * */
package com.winbit.project1.pattern.Bridge;

// 추상 클래스
public abstract class Remote {
	
	// 의존성 추가
	protected final Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	// 구현을 담당하는 추상클래스
	public abstract void power();
	
}

//일반리모콘
class BasicRemote extends Remote{
	public BasicRemote(Device device) {
		super(device);
	}
	
	// 추상클래스 오버라이딩
	@Override
	public void power() {
		if(device.isOn()) {
			device.off();
		} else {
			device.on();
		}
	}
}

//스마트리모콘
class SmartRemote extends Remote {
	public SmartRemote(Device device) {
		super(device);
	}
	
	@Override
	public void power() {
		if(device.isOn()) {
			device.off();
		} else {
			device.on();
		}
	}
	
	public void runApp(String app) {
		device.runApp(app);
	}
		
}
