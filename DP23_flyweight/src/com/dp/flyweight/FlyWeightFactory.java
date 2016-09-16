package com.dp.flyweight;

import java.util.Hashtable;

/**
 * 享元工厂角色类
 * @author zhang
 *
 */
public class FlyWeightFactory {

	private Hashtable<String, Flyweight> hashtable;

	public FlyWeightFactory() {
		super();
		hashtable = new Hashtable<>();
		hashtable.put("1", new ConcreteFlyWeight());
		hashtable.put("2", new ConcreteFlyWeight());
		hashtable.put("3", new ConcreteFlyWeight());
	}
	
	public Flyweight getFlyWeight(String key){
		return hashtable.get(key);
	}
	
}
