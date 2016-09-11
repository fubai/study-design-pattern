package com.dp.factorymethod;

public class FactoryAudi implements Factory{

	public Car createCar(){
		return new CarAudi("audi");
	}
}
