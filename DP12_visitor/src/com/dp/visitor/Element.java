package com.dp.visitor;

/**
 * 元素角色
 * @author zhang
 *
 */
public interface Element {
	
	/**
	 * 接受访问者
	 * @param visitor
	 */
	public void accept(Visitor visitor);
}
