package com.dp.visitor;

/**
 * ��������߽�ɫB
 * @author zhang
 *
 */
public class VisitorB implements Visitor {

	@Override
	public void visit(ElementA elementA) {
		System.out.println(this.getClass().getSimpleName() + " ���� " + elementA.getClass().getSimpleName());
	}

	@Override
	public void visit(ElementB elementB) {
		System.out.println(this.getClass().getSimpleName() + " ���� " + elementB.getClass().getSimpleName());
	}

}
