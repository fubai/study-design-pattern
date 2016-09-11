package com.dp.visitor;

/**
 * 具体访问者角色A
 * @author zhang
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(ElementA elementA) {
		System.out.println(this.getClass().getSimpleName() + " 访问 " + elementA.getClass().getSimpleName());
	}

	@Override
	public void visit(ElementB elementB) {
		System.out.println(this.getClass().getSimpleName() + " 访问 " + elementB.getClass().getSimpleName());
	}

}
