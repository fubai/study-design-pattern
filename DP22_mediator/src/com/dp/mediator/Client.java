package com.dp.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Colleague colleagueA = new ColleagueA(mediator);
		Colleague colleagueB = new ColleagueB(mediator);
		
		mediator.setColleagueA(colleagueA);
		mediator.setColleagueB(colleagueB);
		colleagueA.send("吃饭了吗？");
		colleagueB.send("吃过了，你呢？");
	}
}
