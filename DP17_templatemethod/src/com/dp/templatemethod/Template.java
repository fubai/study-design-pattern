package com.dp.templatemethod;

/**
 * 模板
 * @author zhang
 *
 */
public abstract class Template {

	public void templateMethod1(){
		System.out.println("第一个模板方法");
	}
	public void templateMethod3(){
		System.out.println("第三个模板方法");
	}
	
	public void templateMethod(){
		templateMethod1();
		templateMethod2();
		templateMethod3();
	}
	
	/**
	 * 第二个模板方法
	 */
	public abstract void templateMethod2();
}
