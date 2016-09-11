package com.dp.observer;

/**
 * 观察者
 * @author zhang
 *
 */
public interface Observer {

	/**
	 * 根据事件改变状态
	 */
	public void updateStatus(String event);
}
