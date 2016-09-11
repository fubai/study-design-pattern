package com.dp.decorator;

/**
 * ³ÄÒÂ
 * @author zhang
 *
 */
public class Shirt extends Clothes {


	public Shirt(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("´©ÉÏ³ÄÒÂ");
		super.decorate();
	}
	
	

}
