package com.dp.visitor.another;

/**
 * 访问者角色:人生状态
 * @author zhang
 *
 */
public interface Status {

	/**
	 * 访问元素A：当前状态元素A（男人）的想法
	 * @param man
	 */
	public void mind(Man man);
	/**
	 * 访问元素B：当前状态元素B（女人）的想法
	 * @param woman
	 */
	public void mind(Woman woman);
}
