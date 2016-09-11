package com.dp.chain;

/**
 * 总监
 * @author zhang
 *
 */
public class DirectorHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 10){
			System.out.println("10天以下的请假申请，总监可以批准");
			return "OK";
		}else{
			System.out.println("10天以上的请假申请，需要老板批准");
			Handler bossHandler = new BossHandler();
			setNext(bossHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
