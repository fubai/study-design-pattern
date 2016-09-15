package com.dp.chain.another;

/**
 * 审批链
 * @author zhang
 *
 */
public class Chain {

	//链的长度
	private int n = 0;
	//当前进展到链的位置
	private int cur = 0;
	//每次链增长的长度
	public static final int INCREMENT = 10;
	//审批链
	private Handler[] handlerChain = new Handler[n];
	
	/**
	 * 添加审批者
	 * @param handler
	 */
	public void addHandler(Handler handler){
		for (Handler handlerTemp : handlerChain) {
			if(handler.equals(handlerTemp)){
				return;
			}
		}
		
		if (n == handlerChain.length) {
			Handler[] newHandlerChain =
                new Handler[n + INCREMENT];
            System.arraycopy(handlerChain, 0, newHandlerChain, 0, n);
            handlerChain = newHandlerChain;
        }
		handlerChain[n++] = handler;
	}
	
	/**
	 * 请假审批
	 * @param dayNum
	 */
	public void handler(int dayNum){
		if(cur < n){
			Handler currentHandler = handlerChain[cur++];
			currentHandler.handleRequest(dayNum, this);
		}
	}
}
