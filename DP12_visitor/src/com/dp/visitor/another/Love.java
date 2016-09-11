package com.dp.visitor.another;

/**
 * 具体访问者角色A：恋爱状态
 * @author zhang
 *
 */
public class Love implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " 的状态： " + man.getClass().getSimpleName() + " 凡是不懂也要装懂");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " 的状态： " + woman.getClass().getSimpleName() + " 遇事懂也装作不懂");
	}

}
