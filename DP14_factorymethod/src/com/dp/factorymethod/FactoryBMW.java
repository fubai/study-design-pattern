package com.dp.factorymethod;

public class FactoryBMW implements Factory {

	public Car createCar(){
		return new CarBMW("BMW");
	}
}
