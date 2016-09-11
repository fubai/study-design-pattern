package com.dp.decorator;

/**
 * ����
 * @author zhang
 *
 */
public class Shirt extends Clothes {


	public Shirt(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("���ϳ���");
		super.decorate();
	}
	
	

}
