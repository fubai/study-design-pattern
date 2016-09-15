package com.dp.decorator;

/**
 * 牛仔裤
 * @author zhang
 *
 */
public class Jean extends Clothes {

	public Jean(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("穿上牛仔裤");
		super.decorate();
	}
	
	

}
