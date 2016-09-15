package com.dp.strategy.behavior;

/**
 * 困难难度的进攻行为
 * @author zhang
 *
 */
public class DifficultLevelAttackBehavior implements AttackBehavior {

	/**
	 * 进攻
	 */
	@Override
	public void attack() {
		System.out.println("困难难度的进攻行为");
	}

}
