package com.dp.observer;

/**
 * 在看NBA的同事们
 * @author zhang
 *
 */
public class ObserverNBA implements Observer {

	/**
	 * 如果老板回来，马上停止看NBA
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " 停止观看NBA，继续工作");
	}

}
