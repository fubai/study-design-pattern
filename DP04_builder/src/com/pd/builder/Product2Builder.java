package com.pd.builder;

/**
 * ��Ʒ2�Ľ���
 * @author zhang
 *
 */
public class Product2Builder extends Builder{

	@Override
	public void buildA() {
		System.out.println("��Ʒ2���첿��A");
	}

	@Override
	public void buildB() {
		System.out.println("��Ʒ2���첿��B");
	}

	@Override
	public void buildC() {
		System.out.println("��Ʒ2���첿��C");
	}

	@Override
	public void display() {
		System.out.println("��Ʒ2չʾ");
	}

}
