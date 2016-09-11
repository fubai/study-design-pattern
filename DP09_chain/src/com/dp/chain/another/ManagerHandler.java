package com.dp.chain.another;

/**
 * 经理
 * @author zhang
 *
 */
public class ManagerHandler extends Handler {

	@Override
	public String handleRequest(int dayNum, Chain chain) {
		if(dayNum < 5){
			System.out.println("5天以下的请假申请，经理可以批准");
			return "OK";
		}else{
			System.out.println("5天以上的请假申请，需要总监批准");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
