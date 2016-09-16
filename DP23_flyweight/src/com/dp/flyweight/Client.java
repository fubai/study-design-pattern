package com.dp.flyweight;

public class Client {

	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		
		Flyweight flyweight1 = factory.getFlyWeight("1");
		flyweight1.operation("test1");
		Flyweight flyweight2 = factory.getFlyWeight("1");
		flyweight2.operation("test2");
		Flyweight flyweight3 = factory.getFlyWeight("1");
		flyweight3.operation("test3");
	}
}
