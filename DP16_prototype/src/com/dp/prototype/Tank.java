package com.dp.prototype;

/**
 * ԭ�ͻ���
 * @author zhang
 *
 */
public abstract class Tank {

	/**
	 * ����
	 */
	public String name;
	/**
	 * ������
	 */
	public Double attackPower;
	/**
	 * ������
	 */
	public Double defensePower;
	
	public Tank(){
		
	}

	public abstract Tank clone();
	
}
