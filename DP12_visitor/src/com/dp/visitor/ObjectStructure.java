package com.dp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 * @author zhang
 *
 */
public class ObjectStructure {

	/**
	 * 元素的列表
	 */
	private List<Element> elements = new ArrayList<Element>();
	
	/**
	 * 添加元素
	 * @param element 添加的元素
	 */
	public void addElement(Element element){
		elements.add(element);
	}
	
	/**
	 * 删除元素
	 * @param element 删除的元素
	 */
	public void removeElement(Element element){
		elements.remove(element);
	}
	
	/**
	 * 接受访问
	 * @param visitor
	 */
	public void accept(Visitor visitor){
		//遍历所有元素，都接受访问
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
}
