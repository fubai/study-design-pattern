package com.dp.prototype;

/**
 * ���Ѷȵ�̹��
 * @author zhang
 *
 */
public class SimpleTank extends Tank {

	public SimpleTank() {
		this.name = "simple";
		this.attackPower = 1d;
		this.defensePower = 1d;
		System.out.println("̹�����֣�" + name + " \t��������" + attackPower + " \t��������" + defensePower);
	}

	@Override
	public Tank clone() {
		return new SimpleTank();
	}
}
