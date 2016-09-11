package com.dp.bridge;

/**
 * 抽象手机类
 * @author zhang
 *
 */
public abstract class Phone {

	/**
	 * 手机的软件
	 */
	protected Soft soft;
	
	public Soft getSoft() {
		return soft;
	}

	public void setSoft(Soft soft) {
		this.soft = soft;
	}

	/**
	 * 运行软件
	 */
	public abstract void run();
}
