package com.dp.templatemethod;

/**
 * 模板
 * @author zhang
 *
 */
public abstract class Template {

	public void templateMethod1(){
		System.out.println("模板中的第一个方法");
	}
	public void templateMethod3(){
		System.out.println("模板中的第三个方法");
	}
	
	public void templateMethod(){
		templateMethod1();
		templateMethod2();
		templateMethod3();
	}
	
	/**
	 * 模板实现
	 */
	public abstract void templateMethod2();
}
