package com.dp.chain.another;

/**
 * �������ߵĽӿ�
 * @author zhang
 *
 */
public abstract class Handler {

	
	/**
	 * ��������
	 * @param dayNum �������
	 * @param chain ��������
	 */
	public abstract String handleRequest(int dayNum, Chain chain);
}
