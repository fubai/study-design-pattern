package com.dp.observer;

/**
 * 玩游戏的观察者
 * @author zhang
 *
 */
public class ObserverGAME implements Observer {

	/**
	 * 老板回来了，开始工作
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " 停止玩游戏，开始工作");
	}

}
