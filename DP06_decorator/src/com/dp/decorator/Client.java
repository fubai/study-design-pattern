package com.dp.decorator;

public class Client {
	
	public static void main(String[] args) {
		Person person = new Person();
		Clothes shirt = new Shirt(person);
		Clothes jean = new Jean(shirt);
		Clothes clothes = new Clothes(jean);
		clothes.decorate();
	}
}
