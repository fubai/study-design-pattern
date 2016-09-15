package com.dp.strategy.weapon;

import com.dp.strategy.behavior.SimpleLevelAttackBehavior;
import com.dp.strategy.behavior.SimpleLevelDefenseBehavior;

/**
 * 重武器-坦克
 * @author zhang
 *
 */
public class Tank extends HeavyWeapon {

	public Tank() {
		super.setAttackBehavior(new SimpleLevelAttackBehavior());
		super.setDefenseBehavior(new SimpleLevelDefenseBehavior());
	}
	
	@Override
	public void attack() {
		super.attack();
	}

	@Override
	public void defense() {
		super.defense();
	}
	
}
