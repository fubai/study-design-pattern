package com.dp.observer;

/**
 * 在玩游戏的同事们
 * @author zhang
 *
 */
public class ObserverGAME implements Observer {

	/**
	 * 如果老板回来，马上停止玩游戏
	 */
	@Override
	public void updateStatus(String event) {
		System.out.println(event + " 停止玩游戏，继续工作");
	}

}
