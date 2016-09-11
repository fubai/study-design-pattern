package com.dp.bridge;

/**
 * 手机品牌A
 * @author zhang
 *
 */
public class PhoneBrandA extends Phone {

	@Override
	public void run() {
		System.out.print("手机品牌A ： ");
		getSoft().work();
	}

}
