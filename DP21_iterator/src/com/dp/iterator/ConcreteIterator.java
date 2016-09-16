package com.dp.iterator;

import java.util.List;

/**
 * 具体迭代器角色
 * @author zhang
 *
 */
public class ConcreteIterator implements Iterator {

	private List<String> list;
	
	public ConcreteIterator(List<String> list) {
		super();
		this.list = list;
	}

	/**
	 * 当前元素的索引
	 */
	private int currentIndex;
	
	@Override
	public Object first() {
		return list.get(0);
	}

	@Override
	public Object next() {
		return list.get(currentIndex++);
	}

	@Override
	public Object current() {
		return list.get(currentIndex);
	}

	@Override
	public boolean isDone() {
		return currentIndex >= list.size();
	}

}
