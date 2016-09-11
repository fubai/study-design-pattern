package com.dp.chain;

/**
 * ����
 * @author zhang
 *
 */
public class ManagerHandler extends Handler {

	@Override
	public String handleRequest(int dayNum) {
		if(dayNum < 5){
			System.out.println("5�����µ�������룬���������׼");
			return "OK";
		}else{
			System.out.println("5�����ϵ�������룬��Ҫ�ܼ���׼");
			Handler directorHandler = new DirectorHandler();
			setNext(directorHandler);
			return getNext().handleRequest(dayNum);
		}
	}

}
