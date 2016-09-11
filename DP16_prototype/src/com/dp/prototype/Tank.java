package com.dp.prototype;

/**
 * 原型基类
 * @author zhang
 *
 */
public abstract class Tank {

	/**
	 * 名字
	 */
	public String name;
	/**
	 * 攻击力
	 */
	public Double attackPower;
	/**
	 * 防御力
	 */
	public Double defensePower;
	
	public Tank(){
		
	}

	public abstract Tank clone();
	
}
