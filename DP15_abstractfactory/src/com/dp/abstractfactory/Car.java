package com.dp.abstractfactory;

/**
 * 汽车基类
 * @author zhang
 *
 */
public abstract class Car {

	/**
	 * 车的名字
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
