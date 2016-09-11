package com.dp.chain;

/**
 * �ܼ�
 * @author zhang
 *
 */
public class DirectorHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 10){
			System.out.println("10�����µ�������룬�ܼ������׼");
			return "OK";
		}else{
			System.out.println("10�����ϵ�������룬��Ҫ�ϰ���׼");
			Handler bossHandler = new BossHandler();
			setNext(bossHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
