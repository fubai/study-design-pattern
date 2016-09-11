package com.pd.proxy;

/**
 * 实际对象（被代理者）
 * @author zhang
 *
 */
public class RealObject extends KindObject {

	@Override
	public void doKindThing() {
		System.out.println("实际对象做某种事情");
	}

}
