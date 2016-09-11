package com.dp.prototype;

/**
 * 困难难度的坦克
 * @author zhang
 *
 */
public class DifficultTank extends Tank {

	public DifficultTank() {
		this.name = "difficult";
		this.attackPower = 3d;
		this.defensePower = 3d;
		System.out.println("坦克名字：" + name + " \t攻击力：" + attackPower + " \t防御力：" + defensePower);
	}

	@Override
	public Tank clone() {
		return new DifficultTank();
	}
}
