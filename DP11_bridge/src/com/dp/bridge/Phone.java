package com.dp.bridge;

/**
 * �����ֻ���
 * @author zhang
 *
 */
public abstract class Phone {

	/**
	 * �ֻ������
	 */
	protected Soft soft;
	
	public Soft getSoft() {
		return soft;
	}

	public void setSoft(Soft soft) {
		this.soft = soft;
	}

	/**
	 * �������
	 */
	public abstract void run();
}
