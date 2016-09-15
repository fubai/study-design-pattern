package com.dp.memento;

/**
 * 负责人角色类
 * 
 * @author zhang
 *
 */
public class Caretaker {

	private Memento memento;

	/**
	 * 备忘录的取值方法
	 */
	public Memento retrieveMemento() {
		return this.memento;
	}

	/**
	 * 备忘录的赋值方法
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
