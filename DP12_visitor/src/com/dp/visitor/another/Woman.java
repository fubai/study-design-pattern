package com.dp.visitor.another;

/**
 * 具体元素B ：女人
 * @author zhang
 *
 */
public class Woman implements Person{

	@Override
	public void walkToStatus(Status status) {
		System.out.println(this.getClass().getSimpleName() + " 步入 "+ status.getClass().getSimpleName() +" 的状态");
		status.mind(this);
	}

}
