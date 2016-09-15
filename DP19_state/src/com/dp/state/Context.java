package com.dp.state;

/**
 * 环境角色类
 * @author zhang
 *
 */
public class Context {
	
    private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void handle(String event){
		state.handle(event);
	}
}
