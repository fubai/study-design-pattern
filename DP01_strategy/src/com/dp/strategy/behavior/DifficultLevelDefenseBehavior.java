package com.dp.strategy.behavior;

/**
 * 困难难度的防御行为
 * @author zhang
 *
 */
public class DifficultLevelDefenseBehavior implements DefenseBehavior {

	/**
	 * 防御
	 */
	@Override
	public void defense() {
		System.out.println("困难难度的防御行为");
	}

}
