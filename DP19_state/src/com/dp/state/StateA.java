package com.dp.state;

/**
 * 具体状态A
 * @author zhang
 *
 */
public class StateA implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("具体状态A处理事件"+sampleParameter);
	}

}
