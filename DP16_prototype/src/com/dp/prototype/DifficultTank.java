package com.dp.prototype;

/**
 * �����Ѷȵ�̹��
 * @author zhang
 *
 */
public class DifficultTank extends Tank {

	public DifficultTank() {
		this.name = "difficult";
		this.attackPower = 3d;
		this.defensePower = 3d;
		System.out.println("̹�����֣�" + name + " \t��������" + attackPower + " \t��������" + defensePower);
	}

	@Override
	public Tank clone() {
		return new DifficultTank();
	}
}
