package com.dp.observer;

/**
 * �ڿ�NBA��ͬ����
 * @author zhang
 *
 */
public class ObserverNBA implements Observer {

	/**
	 * ����ϰ����������ֹͣ��NBA
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " ֹͣ�ۿ�NBA����������");
	}

}
