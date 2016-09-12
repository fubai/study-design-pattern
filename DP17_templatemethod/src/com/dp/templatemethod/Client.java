package com.dp.templatemethod;

public class Client {

	public static void main(String[] args) {
		Template template = new ChildTemplate();
		template.templateMethod();
	}
}
