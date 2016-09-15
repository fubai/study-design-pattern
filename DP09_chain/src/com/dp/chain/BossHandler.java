package com.dp.chain;

/**
 * 老板审批
 * @author zhang
 *
 */
public class BossHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 20){
			System.out.println("20天以内老板审批通过");
			return "OK";
		}else{
			System.out.println("20以上老板拒绝审批");
			return "FAIL";
		}
	}

}
