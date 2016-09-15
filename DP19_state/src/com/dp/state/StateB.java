package com.dp.state;

/**
 * 具体状态B
 * @author zhang
 *
 */
public class StateB implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("具体状态B处理事件"+sampleParameter);
	}

}
