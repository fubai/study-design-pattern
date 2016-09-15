package com.dp.prototype;

/**
 * 中等难度的坦克
 * @author zhang
 *
 */
public class MiddleTank extends Tank {

	public MiddleTank() {
		this.name = "middle";
		this.attackPower = 2d;
		this.defensePower = 2d;
		System.out.println("̹坦克" + name + " \t攻击力" + attackPower + " \t防御力" + defensePower);
	}

	@Override
	public Tank clone() {
		return new MiddleTank();
	}
}
