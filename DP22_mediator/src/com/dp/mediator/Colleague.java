package com.dp.mediator;

/**
 * 抽象同事类
 * @author zhang
 *
 */
public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void send(String message);
	public abstract void notify(String message);
}
