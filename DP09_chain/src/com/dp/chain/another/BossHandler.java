package com.dp.chain.another;

/**
 * 老板
 * @author zhang
 *
 */
public class BossHandler extends Handler {

	@Override
	public String handleRequest(int dayNum,Chain chain) {
		if(dayNum < 20){
			System.out.println("20天以下的请假申请，老板可以批准");
			return "OK";
		}else{
			System.out.println("20天以上的请假申请，老板不批准");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
