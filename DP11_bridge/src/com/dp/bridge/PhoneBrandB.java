package com.dp.bridge;

/**
 * 手机品牌B
 * @author zhang
 *
 */
public class PhoneBrandB extends Phone {

	@Override
	public void run() {
		System.out.print("手机品牌B ： ");
		getSoft().work();
	}

}
