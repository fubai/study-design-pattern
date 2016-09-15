package com.dp.chain.another;

/**
 * 总监审批
 * @author zhang
 *
 */
public class DirectorHandler extends Handler {

	@Override
	public String handleRequest(int dayNum,Chain chain) {
		if(dayNum < 10){
			System.out.println("10天以内总监审批通过");
			return "OK";
		}else{
			System.out.println("10天以上需要boss审批");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
