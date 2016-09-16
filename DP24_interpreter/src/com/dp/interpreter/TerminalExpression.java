package com.dp.interpreter;

/**
 * 终结符表达式(Terminal Expression)角色
 * @author zhang
 *
 */
public class TerminalExpression implements Expression {

	@Override
	public void interpret(Context context) {
		if (context.getaString().equals("a")) {
			System.out.println("终结符表达式:"+context.getbString());
		}else if (context.getaString().equals("b")) {
			System.out.println("终结符表达式:"+context.getaString());
		}
	}

}
