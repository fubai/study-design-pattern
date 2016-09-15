package com.dp.visitor.another;

/**
 * 具体访问角色A ： 恋爱状态̬
 * @author zhang
 *
 */
public class Love implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " 状态时 " + man.getClass().getSimpleName() + " 凡事不懂也要装懂");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " 状态时 " + woman.getClass().getSimpleName() + " 遇事懂也装作不懂");
	}

}
