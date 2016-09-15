package com.dp.observer;

/**
 * 看NBA的观察者
 * @author zhang
 *
 */
public class ObserverNBA implements Observer {

	/**
	 * 老板回来了，停止看NBA
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " 停止看NBA，开始工作");
	}

}
