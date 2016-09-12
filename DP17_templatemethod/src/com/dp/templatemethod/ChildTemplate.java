package com.dp.templatemethod;

/**
 * 模板的子类
 * @author zhang
 *
 */
public class ChildTemplate extends Template{

	@Override
	public void templateMethod2() {
		System.out.println("子类实现模板的第二个方法");
	}

}
