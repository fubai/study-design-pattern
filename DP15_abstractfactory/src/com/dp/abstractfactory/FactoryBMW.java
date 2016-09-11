package com.dp.abstractfactory;

public class FactoryBMW implements Factory {

	public Car createCar(){
		return new CarBMW("BMW");
	}
}
