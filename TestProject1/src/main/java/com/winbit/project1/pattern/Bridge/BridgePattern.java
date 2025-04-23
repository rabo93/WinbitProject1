package com.winbit.project1.pattern.Bridge;

public class BridgePattern {
	public static void main(String[] args) {
		Device tv = new TV();
		Remote basicRemote = new BasicRemote(tv);
		basicRemote.power();
		
		SmartRemote smartRemote = new SmartRemote(tv);
		smartRemote.power();
		smartRemote.runApp("Youtube");
		
	}
}
