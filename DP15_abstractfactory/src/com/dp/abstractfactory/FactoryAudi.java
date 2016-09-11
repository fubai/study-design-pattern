package com.dp.abstractfactory;

public class FactoryAudi implements Factory{

	public Car createCar(){
		return new CarAudi("audi");
	}
}
