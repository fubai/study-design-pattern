package com.dp.chain;

public class Client {
	
	public static void main(String[] args) {
		Handler handler = new ManagerHandler();
		handler.handleRequest(40);
	}
}
