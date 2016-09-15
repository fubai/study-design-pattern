package com.pd.builder;

/**
 * 指挥者
 * @author zhang
 *
 */
public class Director {

	/**
	 * 建造
	 */
	public void build(Builder builder){
		builder.buildA();
		builder.buildB();
		builder.buildC();
		builder.display();
	}
	
}
