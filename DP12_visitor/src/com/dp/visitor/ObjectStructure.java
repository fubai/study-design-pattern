package com.dp.visitor;

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
	private List<Element> elements = new ArrayList<Element>();
	
	/**
	 * ���Ԫ��
	 * @param element ����ӵ�Ԫ��
	 */
	public void addElement(Element element){
		elements.add(element);
	}
	
	/**
	 * ɾ��Ԫ��
	 * @param element ��ɾ����Ԫ��
	 */
	public void removeElement(Element element){
		elements.remove(element);
	}
	
	/**
	 * ���ܷ���
	 * @param visitor
	 */
	public void accept(Visitor visitor){
		//��������Ԫ�أ������ܷ���
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
}
