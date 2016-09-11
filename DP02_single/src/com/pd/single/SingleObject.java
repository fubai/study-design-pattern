package com.pd.single;

/**
 * ����
 * @author zhang
 *
 */
public class SingleObject {
 
	private static SingleObject singleObject;
	
	private static Object lock;
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		if(singleObject == null){//��һ���ж��Ƿ�Ϊ�գ������Ϊ�գ�ֱ�ӷ��أ�Ϊ�գ������������������������������
			synchronized(lock){ //��������Ƿ�ֹ��������ĵ���������
				if(singleObject == null){//��һ���ж��Ƿ�Ϊ�գ��Ƿ�ֹ�����ǣ�����߳�ͬʱͨ����һ�ε��Ƿ�Ϊ���ж�
					singleObject = new SingleObject();
				}
			}
		}
		return singleObject;
	}
}
