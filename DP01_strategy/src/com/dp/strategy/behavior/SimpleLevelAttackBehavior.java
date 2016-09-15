package com.dp.strategy.behavior;

/**
 * 简单难度的进攻行为
 * @author zhang
 *
 */
public class SimpleLevelAttackBehavior implements AttackBehavior {

	/**
	 * 进攻
	 */
	@Override
	public void attack() {
		System.out.println("简单难度的进攻行为");
	}

}
