package com.dp.state;

public class Client {

	public static void main(String[] args) {
		Context context1 = new Context();
		context1.setState(new StateA());
		context1.handle("事件1");
		context1.setState(new StateB());
		context1.handle("事件2");
	}
}
