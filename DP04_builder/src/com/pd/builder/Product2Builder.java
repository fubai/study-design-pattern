package com.pd.builder;

/**
 * 产品2建造者
 * @author zhang
 *
 */
public class Product2Builder extends Builder{

	@Override
	public void buildA() {
		System.out.println("产品2建造部件A");
	}

	@Override
	public void buildB() {
		System.out.println("产品2建造部件B");
	}

	@Override
	public void buildC() {
		System.out.println("产品2建造部件C");
	}

	@Override
	public void display() {
		System.out.println("产品2展示");
	}

}
