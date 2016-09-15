package com.dp.memento;

/**
 * 备忘录角色类
 * @author zhang
 *
 */
public class Memento {
	
	private String state;
    
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
