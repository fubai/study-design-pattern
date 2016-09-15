package com.dp.strategy.command;

import com.dp.strategy.behavior.MiddleLevelAttackBehavior;
import com.dp.strategy.behavior.MiddleLevelDefenseBehavior;
import com.dp.strategy.factory.HeavyFactory;
import com.dp.strategy.weapon.HeavyWeapon;

/**
 * 指挥官
 * @author zhang
 *
 */
public class Commander {
	
	public static void main(String[] args) {
		HeavyFactory heavyFactory = new HeavyFactory();
		HeavyWeapon heavyWeapon = heavyFactory.createWeapon("tank");
		heavyWeapon.attack();
		heavyWeapon.defense();
		heavyWeapon.setAttackBehavior(new MiddleLevelAttackBehavior());
		heavyWeapon.setDefenseBehavior(new MiddleLevelDefenseBehavior());
		heavyWeapon.attack();
		heavyWeapon.defense();
	}
}
