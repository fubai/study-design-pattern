package com.db.simplefactory;

/**
 * �򵥹���
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
