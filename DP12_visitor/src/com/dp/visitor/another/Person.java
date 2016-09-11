package com.dp.visitor.another;

/**
 * 元素角色： 人
 * @author zhang
 *
 */
public interface Person {
	
	/**
	 * 接受访问者：人生正处在哪个状态
	 * @param status
	 */
	public void walkToStatus(Status status);
}
