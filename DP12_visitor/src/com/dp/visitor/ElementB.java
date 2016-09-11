package com.dp.visitor;

/**
 * ����Ԫ�ؽ�ɫB
 * @author zhang
 *
 */
public class ElementB implements Element{

	@Override
	public void accept(Visitor visitor) {
		System.out.println(this.getClass().getSimpleName() + " ���� "+ visitor.getClass().getSimpleName() +" ����");
		visitor.visit(this);
	}

}
