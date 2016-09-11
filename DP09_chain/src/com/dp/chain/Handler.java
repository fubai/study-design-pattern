package com.dp.chain;

/**
 * �������ߵĽӿ�
 * @author zhang
 *
 */
public abstract class Handler {

	/**
	 * ��һλ������
	 */
	private Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	/**
	 * ��������
	 * @param dayNum �������
	 */
	public abstract String handleRequest(int dayNum);
}
