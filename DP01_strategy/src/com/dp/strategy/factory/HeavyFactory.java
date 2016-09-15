package com.dp.strategy.factory;

import com.dp.strategy.weapon.HeavyWeapon;
import com.dp.strategy.weapon.Tank;

/**
 * 重工厂
 * @author zhang
 *
 */
public class HeavyFactory {
	
	HeavyWeapon heavyWeapon;
	
	/**
	 * 生产重武器
	 */
	public HeavyWeapon createWeapon(String type){
		switch (type) {
		case "tank":
			heavyWeapon = new Tank();
			break;

		default:
			break;
		}
		return heavyWeapon;
	}
}
