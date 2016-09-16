package com.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		ConcreteIterator concreteIterator = new ConcreteIterator(list);
		while(!concreteIterator.isDone()){
			System.out.println(concreteIterator.next());
		}
		
		
		Aggregat aggregat = new ConcreteAggregat(list);
		Iterator iterator = aggregat.getIterator();
		while(!iterator.isDone()){
			System.out.println(iterator.next());
		}
		//ConcreteIterator 具体的遍历方法由这个对象决定，如果需要其他遍历顺序，只需再添加一个相似的类即可
	}
}
