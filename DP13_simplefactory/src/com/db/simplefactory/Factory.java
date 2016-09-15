package com.db.simplefactory;

/**
 * 工厂
 * @author zhang
 *
 */
public class Factory {

	public static Car createCar(String name){
		Car car = null;
		switch (name) {
		case "BMW":
			car = new CarBMW(name);
			break;
		case "audi":
			car = new CarAudi(name);
			break;

		default:
			break;
		}
		return car;
	}
}
