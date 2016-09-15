package com.dp.visitor;

/**
 * 具体元素B
 * @author zhang
 *
 */
public class ElementB implements Element{

	@Override
	public void accept(Visitor visitor) {
		System.out.println(this.getClass().getSimpleName() + " 接受 "+ visitor.getClass().getSimpleName() +" 访问");
		visitor.visit(this);
	}

}
