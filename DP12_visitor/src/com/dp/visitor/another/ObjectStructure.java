package com.dp.visitor.another;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 * @author zhang
 *
 */
public class ObjectStructure {

	/**
	 * 元素的集合
	 */
	private List<Person> elements = new ArrayList<Person>();
	
	/**
	 * 添加元素
	 * @param element 被添加的元素
	 */
	public void addElement(Person element){
		elements.add(element);
	}
	
	/**
	 * 删除元素
	 * @param element 被删除的元素
	 */
	public void removeElement(Person element){
		elements.remove(element);
	}
	
	/**
	 * 接受访问
	 * @param visitor
	 */
	public void accept(Status visitor){
		//遍历所有元素，都接受访问
		for (Person element : elements) {
			element.walkToStatus(visitor);
		}
	}
}
