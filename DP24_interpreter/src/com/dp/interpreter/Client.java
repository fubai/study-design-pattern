package com.dp.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setaString("a");
		context.setbString("b");
		
		List<Expression> list = new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		
		for (Expression expression : list) {
			expression.interpret(context);
		}
	}
}
