package com.pd.proxy;

/**
 * 客户端
 * @author zhang
 *
 */
public class Client {

	public static void main(String[] args) {
		KindObject proxy = new Proxy();
		proxy.doKindThing();
		
	}
}
