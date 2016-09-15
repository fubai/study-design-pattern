package com.dp.chain.another;

/**
 * 老板审批
 * @author zhang
 *
 */
public class BossHandler extends Handler {

	@Override
	public String handleRequest(int dayNum,Chain chain) {
		if(dayNum < 20){
			System.out.println("20天以内老板审批通过");
			return "OK";
		}else{
			System.out.println("20天以上老板审批不通过");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
