package com.dp.iterator;

import java.util.List;

public class ConcreteAggregat implements Aggregat {

	private List<String> list;
	
	public ConcreteAggregat(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public Iterator getIterator() {
		return new ConcreteIterator(list);
	}

}
