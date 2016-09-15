package com.dp.prototype;

/**
 * 简单难度的坦克
 * @author zhang
 *
 */
public class SimpleTank extends Tank {

	public SimpleTank() {
		this.name = "simple";
		this.attackPower = 1d;
		this.defensePower = 1d;
		System.out.println("̹坦克" + name + " \t攻击力" + attackPower + " \t防御力" + defensePower);
	}

	@Override
	public Tank clone() {
		return new SimpleTank();
	}
}
