package com.dp.prototype;

public class Client {

	public static void main(String[] args) {
		Tank tank1 = new SimpleTank();
		Tank tank2 = tank1.clone();
		
		Tank tank11 = new MiddleTank();
		Tank tank12 = tank11.clone();
		
		Tank tank21 = new DifficultTank();
		Tank tank22 = tank21.clone();
	}
}
