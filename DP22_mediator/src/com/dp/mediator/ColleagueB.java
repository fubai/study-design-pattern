package com.dp.mediator;

/**
 * 具体同事类B
 * @author zhang
 *
 */
public class ColleagueB extends Colleague {

	public ColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		System.out.println("同事B发送消息:" + message);
		mediator.send(message, this);
	}

	@Override
	public void notify(String message) {
		System.out.println("同事B收到消息:" + message);
	}

}
