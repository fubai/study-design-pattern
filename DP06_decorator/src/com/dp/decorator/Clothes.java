package com.dp.decorator;

/**
 * 衣服
 * @author zhang
 *
 */
public class Clothes extends Person {

	private Person person;
	
	public Clothes(Person person){
		this.person = person;
	}
	
	@Override
	public void decorate() {
		person.decorate();
	}

}
