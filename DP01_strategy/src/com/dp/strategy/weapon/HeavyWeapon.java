package com.dp.strategy.weapon;

import com.dp.strategy.behavior.AttackBehavior;
import com.dp.strategy.behavior.DefenseBehavior;

/**
 * ÖØĞÍÎäÆ÷
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
	 * ¹¥»÷
	 */
	public void attack(){
		attackBehavior.attack();
	}
	/**
	 * ·ÀÓù
	 */
	public void defense(){
		defenseBehavior.defense();
	}
	
}
