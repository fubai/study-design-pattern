package com.dp.composite;

public class Client {

	public static void main(String[] args) {
		Component root = new ConcreteComponent("root");
		Component child1 = new ConcreteComponent("child1");
		Component child2 = new ConcreteComponent("child2");
		Component child3 = new ConcreteComponent("child3");
		root.addComponent(child1);
		root.addComponent(child2);
		root.addComponent(child3);
		
		
		Component child1_1 = new ConcreteComponent("child1_1");
		Component child1_2 = new ConcreteComponent("child1_2");
		child1.addComponent(child1_1);
		child1.addComponent(child1_2);
		
		Component bottom1_2_1 = new BottomComponent("bottom1_2_1");
		child1_2.addComponent(bottom1_2_1);
		
		Component bottom2_1 = new BottomComponent("bottom2_1");
		child2.addComponent(bottom2_1);
		
		root.display(1);
		
	}
}
