package com.dp.visitor;

/**
 * ����Ԫ�ؽ�ɫA
 * @author zhang
 *
 */
public class ElementA implements Element{

	@Override
	public void accept(Visitor visitor) {
		System.out.println(this.getClass().getSimpleName() + " ���� "+ visitor.getClass().getSimpleName() +" ����");
		visitor.visit(this);
	}

}
