package com.dp.strategy.behavior;

/**
 * 中等难度的进攻行为
 * @author zhang
 *
 */
public class MiddleLevelAttackBehavior implements AttackBehavior {

	/**
	 * 进攻
	 */
	@Override
	public void attack() {
		System.out.println("中等难度的进攻行为");
	}

}
