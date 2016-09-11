package com.dp.visitor.another;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ṹ��ɫ
 * @author zhang
 *
 */
public class ObjectStructure {

	/**
	 * Ԫ�صļ���
	 */
	private List<Person> elements = new ArrayList<Person>();
	
	/**
	 * ���Ԫ��
	 * @param element ����ӵ�Ԫ��
	 */
	public void addElement(Person element){
		elements.add(element);
	}
	
	/**
	 * ɾ��Ԫ��
	 * @param element ��ɾ����Ԫ��
	 */
	public void removeElement(Person element){
		elements.remove(element);
	}
	
	/**
	 * ���ܷ���
	 * @param visitor
	 */
	public void accept(Status visitor){
		//��������Ԫ�أ������ܷ���
		for (Person element : elements) {
			element.walkToStatus(visitor);
		}
	}
}
