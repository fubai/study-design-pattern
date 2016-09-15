package com.dp.observer;

/**
 * 观察者
 * @author zhang
 *
 */
public interface Observer {

	/**
	 * 由于事件，修改状态  比如老板回来了，赶紧工作
	 */
	public void updateStatus(String event);
}
