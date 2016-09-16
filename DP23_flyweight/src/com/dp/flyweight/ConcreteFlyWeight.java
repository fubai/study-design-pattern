package com.dp.flyweight;

/**
 * 具体享元角色
 * @author zhang
 *
 */
public class ConcreteFlyWeight implements Flyweight {

	@Override
	public void operation(String state) {
		System.out.println("具体flyweight：" + state);
	}

}
