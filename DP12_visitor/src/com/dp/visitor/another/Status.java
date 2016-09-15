package com.dp.visitor.another;

/**
 * 访问者角色
 * @author zhang
 *
 */
public interface Status {

	/**
	 * 访问具体元素A： 男人的想法
	 * @param man
	 */
	public void mind(Man man);
	/**
	 * 访问具体元素B： 女人的想法
	 * @param woman
	 */
	public void mind(Woman woman);
}
