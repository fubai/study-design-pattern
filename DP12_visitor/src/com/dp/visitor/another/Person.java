package com.dp.visitor.another;

/**
 * 元素角色:人
 * @author zhang
 *
 */
public interface Person {
	
	/**
	 * 人生步入什么状态
	 * @param status 状态
	 */
	public void walkToStatus(Status status);
}
