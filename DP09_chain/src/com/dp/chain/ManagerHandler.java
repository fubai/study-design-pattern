package com.dp.chain;

/**
 * 经理
 * @author zhang
 *
 */
public class ManagerHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 5){
			System.out.println("5天以下的请假申请，经理可以批准");
			return "OK";
		}else{
			System.out.println("5天以上的请假申请，需要总监批准");
			Handler directorHandler = new DirectorHandler();
			setNext(directorHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
