package com.pd.builder;

/**
 * ��Ʒ1�Ľ���
 * @author zhang
 *
 */
public class Product1Builder extends Builder{

	@Override
	public void buildA() {
		System.out.println("��Ʒ1���첿��A");
	}

	@Override
	public void buildB() {
		System.out.println("��Ʒ1���첿��B");
	}

	@Override
	public void buildC() {
		System.out.println("��Ʒ1���첿��C");
	}

	@Override
	public void display() {
		System.out.println("��Ʒ1չʾ");
	}

}
