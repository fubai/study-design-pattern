package com.dp.abstractfactory;

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
