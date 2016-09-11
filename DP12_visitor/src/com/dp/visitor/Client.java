package com.dp.visitor;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		Element elementA1 = new ElementA();
		Element elementB1 = new ElementB();
		
		objectStructure.addElement(elementA1);
		objectStructure.addElement(elementB1);
		
		Visitor visitorA = new VisitorA();
		Visitor visitorB = new VisitorB();
		
		objectStructure.accept(visitorA);
		objectStructure.accept(visitorB);
	}
}
