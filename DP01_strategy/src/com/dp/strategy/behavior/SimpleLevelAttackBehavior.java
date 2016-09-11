package com.dp.strategy.behavior;

/**
 * 简单难度的攻击行为
 * @author zhang
 *
 */
public class SimpleLevelAttackBehavior implements AttackBehavior {

	/**
	 * 攻击
	 */
	@Override
	public void attack() {
		System.out.println("攻击强度为简单！");
	}

}
