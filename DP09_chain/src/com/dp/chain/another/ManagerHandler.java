package com.dp.chain.another;

/**
 * ����
 * @author zhang
 *
 */
public class ManagerHandler extends Handler {

	@Override
	public String handleRequest(int dayNum, Chain chain) {
		if(dayNum < 5){
			System.out.println("5�����µ�������룬���������׼");
			return "OK";
		}else{
			System.out.println("5�����ϵ�������룬��Ҫ�ܼ���׼");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
