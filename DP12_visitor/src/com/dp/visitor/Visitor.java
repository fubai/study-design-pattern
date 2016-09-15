package com.dp.visitor;

/**
 * 访问者
 * @author zhang
 *
 */
public interface Visitor {

	/**
	 * 访问方法，访问元素A
	 * @param elementA
	 */
	public void visit(ElementA elementA);
	/**
	 * 访问方法，访问元素B
	 * @param elementB
	 */
	public void visit(ElementB elementB);
}
