package com.pd.builder;

/**
 * ָ����
 * @author zhang
 *
 */
public class Director {

	/**
	 * ���췽��
	 */
	public void build(Builder builder){
		builder.buildA();
		builder.buildB();
		builder.buildC();
		builder.display();
	}
	
}
