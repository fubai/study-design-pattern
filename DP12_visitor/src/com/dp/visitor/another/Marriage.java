package com.dp.visitor.another;

/**
 * 具体访问角色B ： 结婚状态
 * @author zhang
 *
 */
public class Marriage implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " 状态时" + man.getClass().getSimpleName() + " 感慨道：恋爱游戏终结时，‘有妻徒刑’终无期");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " 状态时" + woman.getClass().getSimpleName() + " 欣慰曰：爱情长跑路漫漫，婚姻保险保平安");
	}

}
