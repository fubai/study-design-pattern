package com.dp.interpreter;
/**
 * 非终结符表达式(Nonterminal Expression)角色
 * @author zhang
 *
 */
public class NonterminalExpression implements Expression {

	@Override
	public void interpret(Context context) {
		if (context.getaString().equals("a")) {
			System.out.println("终结符表达式:"+context.getaString());
		}else if (context.getaString().equals("b")) {
			System.out.println("终结符表达式:"+context.getbString());
		}
	}

}
