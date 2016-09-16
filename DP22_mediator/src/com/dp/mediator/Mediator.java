package com.dp.mediator;

/**
 * 中介者类
 * @author zhang
 *
 */
public class Mediator {

	public Colleague colleagueA ;
	public Colleague colleagueB ;
	
	public Colleague getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(Colleague colleagueA) {
		this.colleagueA = colleagueA;
	}

	public Colleague getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(Colleague colleagueB) {
		this.colleagueB = colleagueB;
	}

	public void send(String message,Colleague colleague){
		if(colleague == colleagueA){
			colleagueB.notify(message);
		}else{
			colleagueA.notify(message);
		}
	}
}
