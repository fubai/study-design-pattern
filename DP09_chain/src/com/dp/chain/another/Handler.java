package com.dp.chain.another;

/**
 * 审批者
 * @author zhang
 *
 */
public abstract class Handler {

	
	/**
	 * 审批方法
	 * @param dayNum 请假天数
	 * @param chain 审批链
	 */
	public abstract String handleRequest(int dayNum, Chain chain);
}
