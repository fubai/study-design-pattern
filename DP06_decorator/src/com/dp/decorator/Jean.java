package com.dp.decorator;

/**
 * ţ�п�
 * @author zhang
 *
 */
public class Jean extends Clothes {

	public Jean(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("����ţ�п�");
		super.decorate();
	}
	
	

}
