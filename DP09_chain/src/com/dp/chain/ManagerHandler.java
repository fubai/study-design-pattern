package com.dp.chain;

/**
 * 经理审批
 * @author zhang
 *
 */
public class ManagerHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 5){
			System.out.println("5以内经理审批通过");
			return "OK";
		}else{
			System.out.println("5天以上需要总监审批");
			Handler directorHandler = new DirectorHandler();
			setNext(directorHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
