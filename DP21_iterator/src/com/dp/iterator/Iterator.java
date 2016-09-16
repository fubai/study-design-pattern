package com.dp.iterator;

/**
 * 迭代器角色
 * @author zhang
 *
 */
public interface Iterator {

	public Object first();
	public Object next();
	public Object current();
	public boolean isDone();
}
