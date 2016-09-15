package com.pd.builder;

/**
 * 客户端
 * @author zhang
 *
 */
public class Client {
		
	public static void main(String[] args) {
		Director director = new Director();
		director.build(new Product1Builder());
		director.build(new Product2Builder());
	}
}
