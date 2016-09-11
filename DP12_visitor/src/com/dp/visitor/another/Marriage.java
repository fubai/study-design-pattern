package com.dp.visitor.another;

/**
 * 具体访问者角色B:结婚状态
 * @author zhang
 *
 */
public class Marriage implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " 的状态： " + man.getClass().getSimpleName() + " 感概道：恋爱游戏终结时，‘有妻徒刑’终无期");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " 的状态： " + woman.getClass().getSimpleName() + " 欣慰曰：爱情长跑路漫漫，婚姻保险保安全");
	}

}
