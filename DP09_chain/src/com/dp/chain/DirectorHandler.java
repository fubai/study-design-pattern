package com.dp.chain;

/**
 * 总监审批
 * @author zhang
 *
 */
public class DirectorHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 10){
			System.out.println("10以内总监审批通过");
			return "OK";
		}else{
			System.out.println("10以上需要boss审批");
			Handler bossHandler = new BossHandler();
			setNext(bossHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
