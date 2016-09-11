package com.dp.observer;

public class Client {

	public static void main(String[] args) {
		Informer informer = new Informer();
		informer.addObserver(new ObserverNBA());
		informer.addObserver(new ObserverGAME());

		informer.setEvent("�ϰ������");
		
		informer.notifyObserver();
	}
}
