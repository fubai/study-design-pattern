package com.dp.visitor.another;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		Person man = new Man();
		Person woman = new Woman();
		
		objectStructure.addElement(man);
		objectStructure.addElement(woman);
		
		Status love = new Love();
		Status marriage = new Marriage();
		
		objectStructure.accept(love);
		objectStructure.accept(marriage);
	}
}
