package com.dp.chain.another;

/**
 * �ϰ�
 * @author zhang
 *
 */
public class BossHandler extends Handler {

	@Override
	public String handleRequest(int dayNum,Chain chain) {
		if(dayNum < 20){
			System.out.println("20�����µ�������룬�ϰ������׼");
			return "OK";
		}else{
			System.out.println("20�����ϵ�������룬�ϰ岻��׼");
			chain.handler(dayNum);
			return "chain OK";
		}
	}

}
