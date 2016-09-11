package com.dp.chain.another;

/**
 * 抽象处理者的接口
 * @author zhang
 *
 */
public abstract class Handler {

	
	/**
	 * 处理请求
	 * @param dayNum 请假天数
	 * @param chain 处理者链
	 */
	public abstract String handleRequest(int dayNum, Chain chain);
}
