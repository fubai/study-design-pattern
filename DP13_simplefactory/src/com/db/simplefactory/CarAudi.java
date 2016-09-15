package com.db.simplefactory;

public class CarAudi extends Car {

	public CarAudi(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("展示一辆" + name + "汽车");
	}
}
