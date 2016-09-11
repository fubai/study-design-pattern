package com.dp.chain.another;

/**
 * 责任链
 * @author zhang
 *
 */
public class Chain {

	//记录数组长度
	private int n = 0;
	//记录当前处理的位置
	private int cur = 0;
	//数组每次增加的长度
	public static final int INCREMENT = 10;
	//初始化处理者的数组
	private Handler[] handlerChain = new Handler[n];
	
	/**
	 * 添加处理者
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
	 * 处理请求
	 * @param dayNum
	 */
	public void handler(int dayNum){
		if(cur < n){
			Handler currentHandler = handlerChain[cur++];
			currentHandler.handleRequest(dayNum, this);
		}
	}
}
