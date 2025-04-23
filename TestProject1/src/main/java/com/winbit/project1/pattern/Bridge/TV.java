package com.winbit.project1.pattern.Bridge;

public class TV implements Device {
	
	private boolean on = false;
	
	@Override
	public void on() {
		on = true;
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		on = false;
		System.out.println("TV is off");
	}

	@Override
	public boolean isOn() {
		return on;
	}

	@Override
	public void runApp(String App) {
		if(isOn()) {
			System.out.println("TV Run App " + App);
		} else {
			System.out.println("TV is not on");
		}
	}
	
}

// ...다른 디바이스들 내부 코드는 같으므로 생략