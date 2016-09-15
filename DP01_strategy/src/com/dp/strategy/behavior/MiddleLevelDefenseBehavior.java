package com.dp.strategy.behavior;

/**
 * 中等难度的防御行为
 * @author zhang
 *
 */
public class MiddleLevelDefenseBehavior implements DefenseBehavior {

	/**
	 * 防御
	 */
	@Override
	public void defense() {
		System.out.println("中等难度的防御行为");
	}

}
