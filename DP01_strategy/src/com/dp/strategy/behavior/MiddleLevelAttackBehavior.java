package com.dp.strategy.behavior;

/**
 * 中等难度的攻击
 * @author zhang
 *
 */
public class MiddleLevelAttackBehavior implements AttackBehavior {

	/**
	 * 攻击
	 */
	@Override
	public void attack() {
		System.out.println("攻击强度为中等！");
	}

}
