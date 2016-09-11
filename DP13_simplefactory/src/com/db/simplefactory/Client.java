package com.db.simplefactory;

public class Client {

	public static void main(String[] args) {
		Car car1 = Factory.createCar("BMW");
		Car car2 = Factory.createCar("audi");
		
		car1.display();
		car2.display();
	}
}
