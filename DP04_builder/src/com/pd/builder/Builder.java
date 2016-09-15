package com.pd.builder;

/**
 * 建造者的抽象类
 * @author zhang
 *
 */
public abstract class Builder {
	
	//建造部件A
	public abstract void buildA();
	//建造部件B
	public abstract void buildB();
	//建造部件C
	public abstract void buildC();
	
	//展示
	public abstract void display();
}
