package com.dp.prototype;

/**
 * 困难模式的tank
 * @author zhang
 *
 */
public class DifficultTank extends Tank {

	public DifficultTank() {
		this.name = "difficult";
		this.attackPower = 3d;
		this.defensePower = 3d;
		System.out.println("̹坦克" + name + " \t攻击力" + attackPower + " \t防御力" + defensePower);
	}

	@Override
	public Tank clone() {
		return new DifficultTank();
	}
}
