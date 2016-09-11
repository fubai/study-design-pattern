package com.dp.visitor;

/**
 * 具体元素角色A
 * @author zhang
 *
 */
public class ElementA implements Element{

	@Override
	public void accept(Visitor visitor) {
		System.out.println(this.getClass().getSimpleName() + " 接受 "+ visitor.getClass().getSimpleName() +" 访问");
		visitor.visit(this);
	}

}
