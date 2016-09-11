package com.dp.chain.another;

public class Client {
	
	public static void main(String[] args) {
		Chain chain = new Chain();
		Handler managerHandler = new ManagerHandler();
		Handler directorHandler = new DirectorHandler();
		Handler bossHandler = new BossHandler();
		chain.addHandler(managerHandler);
		chain.addHandler(directorHandler);
		chain.addHandler(bossHandler);
		
		chain.handler(40);
		
	}
}
