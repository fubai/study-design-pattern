package com.dp.visitor.another;

/**
 * 具体元素角色A：男人
 * @author zhang
 *
 */
public class Man implements Person{

	@Override
	public void walkToStatus(Status status) {
		System.out.println(this.getClass().getSimpleName() + " 处于 "+ status.getClass().getSimpleName() +" 的状态");
		status.mind(this);
	}

}
