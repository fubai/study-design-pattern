package com.dp.factorymethod;

public class Client {

	public static void main(String[] args) {
		Car car1 = new FactoryBMW().createCar();
		Car car2 = new FactoryAudi().createCar();
		
		car1.display();
		car2.display();
	}
}
