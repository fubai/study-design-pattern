package com.dp.factorymethod;

public class CarAudi extends Car {

	public CarAudi(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("����һ��" + name + "��");
	}
}
