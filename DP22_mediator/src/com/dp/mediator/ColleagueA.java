package com.dp.mediator;

/**
 * 具体同事类A
 * @author zhang
 *
 */
public class ColleagueA extends Colleague {

	public ColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		System.out.println("同事A发送消息:" + message);
		mediator.send(message, this);
	}

	@Override
	public void notify(String message) {
		System.out.println("同事A收到消息:" + message);
	}

}
