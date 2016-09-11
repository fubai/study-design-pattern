package com.dp.factorymethod;

public class CarBMW extends Car {

	public CarBMW(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("这是一辆" + name + "车");
	}
}
