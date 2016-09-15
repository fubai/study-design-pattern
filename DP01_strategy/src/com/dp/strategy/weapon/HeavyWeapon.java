package com.dp.strategy.weapon;

import com.dp.strategy.behavior.AttackBehavior;
import com.dp.strategy.behavior.DefenseBehavior;

/**
 * 重武器
 * @author zhang
 *
 */
public class HeavyWeapon {
	
	public HeavyWeapon(){
		
	}
	
	protected AttackBehavior attackBehavior;
	
	protected DefenseBehavior defenseBehavior;

	public AttackBehavior getAttackBehavior() {
		return attackBehavior;
	}

	public void setAttackBehavior(AttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}

	public DefenseBehavior getDefenseBehavior() {
		return defenseBehavior;
	}

	public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
		this.defenseBehavior = defenseBehavior;
	}
	
	/**
	 * 进攻
	 */
	public void attack(){
		attackBehavior.attack();
	}
	/**
	 * 防御
	 */
	public void defense(){
		defenseBehavior.defense();
	}
	
}
