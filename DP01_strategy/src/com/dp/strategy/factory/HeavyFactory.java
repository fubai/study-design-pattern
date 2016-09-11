package com.dp.strategy.factory;

import com.dp.strategy.weapon.HeavyWeapon;
import com.dp.strategy.weapon.Tank;

/**
 * �ع���
 * @author zhang
 *
 */
public class HeavyFactory {
	
	HeavyWeapon heavyWeapon;
	
	/**
	 * ��������:�ع�������������
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
