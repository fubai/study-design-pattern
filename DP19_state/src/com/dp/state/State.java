package com.dp.state;

/**
 * 抽象状态接口
 * @author zhang
 *
 */
public interface State {
	 /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
