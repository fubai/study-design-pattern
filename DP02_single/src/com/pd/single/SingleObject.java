package com.pd.single;

/**
 * 单例
 * @author zhang
 *
 */
public class SingleObject {
 
	private static SingleObject singleObject;
	
	private static Object lock;
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		if(singleObject == null){//第一次判断是否为空，如果不为空，直接返回，为空，再添加锁，避免锁带来的性能问题
			synchronized(lock){ //这里加锁是防止并发情况的单例不成立
				if(singleObject == null){//又一次判断是否为空，是防止并发是，多个线程同时通过第一次的是否为空判断
					singleObject = new SingleObject();
				}
			}
		}
		return singleObject;
	}
}