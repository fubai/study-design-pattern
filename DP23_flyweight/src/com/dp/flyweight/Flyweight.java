package com.dp.flyweight;

/**
 * 抽象享元角色类
 * @author zhang
 *
 */
public interface Flyweight {
	//接受外部状态，参数state是外部状态
    public void operation(String state);
}
