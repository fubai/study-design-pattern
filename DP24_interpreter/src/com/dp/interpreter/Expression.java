package com.dp.interpreter;

/**
 * 抽象表达式角色
 * @author zhang
 *
 */
public interface Expression {

	/**
	 * 解释
	 */
	public void interpret(Context context);
}
