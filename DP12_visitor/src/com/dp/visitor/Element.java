package com.dp.visitor;

/**
 * Ԫ�ؽ�ɫ
 * @author zhang
 *
 */
public interface Element {
	
	/**
	 * ���ܷ�����
	 * @param visitor
	 */
	public void accept(Visitor visitor);
}
