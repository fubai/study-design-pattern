package com.dp.strategy.behavior;

/**
 * 困难难度的攻击
 * @author zhang
 *
 */
public class DifficultLevelAttackBehavior implements AttackBehavior {

	/**
	 * 攻击
	 */
	@Override
	public void attack() {
		System.out.println("攻击强度为困难！");
	}

}
