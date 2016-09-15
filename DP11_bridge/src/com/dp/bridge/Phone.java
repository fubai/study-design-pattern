package com.dp.bridge;

/**
 * 手机
 * @author zhang
 *
 */
public abstract class Phone {

	/**
	 * 手机软件
	 */
	protected Soft soft;
	
	public Soft getSoft() {
		return soft;
	}

	public void setSoft(Soft soft) {
		this.soft = soft;
	}

	/**
	 * 运行
	 */
	public abstract void run();
}
