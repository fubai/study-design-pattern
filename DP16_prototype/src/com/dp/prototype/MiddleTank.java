package com.dp.prototype;

/**
 * �е��Ѷȵ�̹��
 * @author zhang
 *
 */
public class MiddleTank extends Tank {

	public MiddleTank() {
		this.name = "middle";
		this.attackPower = 2d;
		this.defensePower = 2d;
		System.out.println("̹�����֣�" + name + " \t��������" + attackPower + " \t��������" + defensePower);
	}

	@Override
	public Tank clone() {
		return new MiddleTank();
	}
}
