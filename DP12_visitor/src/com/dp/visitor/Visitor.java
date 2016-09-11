package com.dp.visitor;

/**
 * �����߽�ɫ
 * @author zhang
 *
 */
public interface Visitor {

	/**
	 * ����Ԫ��A
	 * @param elementA
	 */
	public void visit(ElementA elementA);
	/**
	 * ����Ԫ��B
	 * @param elementB
	 */
	public void visit(ElementB elementB);
}
