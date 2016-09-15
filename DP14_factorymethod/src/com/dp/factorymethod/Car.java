package com.dp.factorymethod;

/**
 * 汽车
 * @author zhang
 *
 */
public abstract class Car {

	/**
	 * 名字
	 */
	protected String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * 展示
	 */
	public abstract void display();
}
