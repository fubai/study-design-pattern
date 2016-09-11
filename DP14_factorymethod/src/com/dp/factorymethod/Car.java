package com.dp.factorymethod;

/**
 * ��������
 * @author zhang
 *
 */
public abstract class Car {

	/**
	 * ��������
	 */
	protected String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * չʾ
	 */
	public abstract void display();
}
