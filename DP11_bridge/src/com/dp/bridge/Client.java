package com.dp.bridge;

public class Client {

	public static void main(String[] args) {
		Phone phoneA = new PhoneBrandA();
		Phone phoneB = new PhoneBrandB();
		
		Soft softMp3 = new SoftMP3();
		Soft softChat = new SoftChat();
		
		phoneA.setSoft(softMp3);
		phoneB.setSoft(softChat);
		
		phoneA.run();
		phoneB.run();
	}
}
