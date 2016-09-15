package com.dp.decorator;

/**
 * 衬衫
 * @author zhang
 *
 */
public class Shirt extends Clothes {


	public Shirt(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("穿上衬衫");
		super.decorate();
	}
	
	

}
