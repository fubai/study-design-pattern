package com.dp.templatemethod;

/**
 * ģ��
 * @author zhang
 *
 */
public abstract class Template {

	public void templateMethod1(){
		System.out.println("ģ���еĵ�һ������");
	}
	public void templateMethod3(){
		System.out.println("ģ���еĵ���������");
	}
	
	public void templateMethod(){
		templateMethod1();
		templateMethod2();
		templateMethod3();
	}
	
	/**
	 * ģ��ʵ��
	 */
	public abstract void templateMethod2();
}
