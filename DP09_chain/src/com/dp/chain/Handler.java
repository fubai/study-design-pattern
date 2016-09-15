package com.dp.chain;

/**
 * 审批流程
 * @author zhang
 *
 */
public abstract class Handler {

	/**
	 * 下一个审批人
	 */
	private Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	/**
	 * 审批
	 * @param dayNum 请假天数
	 */
	public abstract String handleRequest(int dayNum);
}
