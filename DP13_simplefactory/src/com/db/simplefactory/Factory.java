package com.db.simplefactory;

/**
 * ¼òµ¥¹¤³§
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
