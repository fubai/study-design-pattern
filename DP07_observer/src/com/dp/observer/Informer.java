package com.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者
 * @author zhang
 *
 */
public class Informer {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
	
	/**
	 * 事件
	 */
	private String event;
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public void notifyObserver(){
		for (Observer observer : observers) {
			observer.updateStatus(getEvent());
		}
	}
}
