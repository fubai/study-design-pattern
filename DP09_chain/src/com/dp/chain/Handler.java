package com.dp.chain;

/**
 * 抽象处理者的接口
 * @author zhang
 *
 */
public abstract class Handler {

	/**
	 * 下一位处理者
	 */
	private Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	/**
	 * 处理请求
	 * @param dayNum 请假天数
	 */
	public abstract String handleRequest(int dayNum);
}
