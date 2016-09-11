package com.dp.chain.another;

/**
 * ������
 * @author zhang
 *
 */
public class Chain {

	//��¼���鳤��
	private int n = 0;
	//��¼��ǰ�����λ��
	private int cur = 0;
	//����ÿ�����ӵĳ���
	public static final int INCREMENT = 10;
	//��ʼ�������ߵ�����
	private Handler[] handlerChain = new Handler[n];
	
	/**
	 * ��Ӵ�����
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
	 * ��������
	 * @param dayNum
	 */
	public void handler(int dayNum){
		if(cur < n){
			Handler currentHandler = handlerChain[cur++];
			currentHandler.handleRequest(dayNum, this);
		}
	}
}
