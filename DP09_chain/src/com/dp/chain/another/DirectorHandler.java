package com.dp.chain.another;

/**
 * �ܼ�
 * @author zhang
 *
 */
public class DirectorHandler extends Handler {

	@Override
	public String handleRequest(int dayNum,Chain chain) {
		if(dayNum < 10){
			System.out.println("10�����µ�������룬�ܼ������׼");
			return "OK";
		}else{
			System.out.println("10�����ϵ�������룬��Ҫ�ϰ���׼");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
