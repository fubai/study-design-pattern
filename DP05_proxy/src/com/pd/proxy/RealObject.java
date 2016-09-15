package com.pd.proxy;

/**
 * 真实对象
 * @author zhang
 *
 */
public class RealObject extends KindObject {

	@Override
	public void doKindThing() {
		System.out.println("真实对象做某种事情");
	}

}
