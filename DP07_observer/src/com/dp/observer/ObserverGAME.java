package com.dp.observer;

/**
 * ������Ϸ��ͬ����
 * @author zhang
 *
 */
public class ObserverGAME implements Observer {

	/**
	 * ����ϰ����������ֹͣ����Ϸ
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " ֹͣ����Ϸ����������");
	}

}
