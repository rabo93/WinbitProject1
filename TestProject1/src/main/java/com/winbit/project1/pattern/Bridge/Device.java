package com.winbit.project1.pattern.Bridge;

public interface Device {
	void on(); //켜는 메서드
	void off(); //끄는 메서드
	boolean isOn(); //켜져있는지 상태
	void runApp(String App); //App에 따른 작동 메서드
}
