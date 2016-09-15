package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体组件
 * @author zhang
 *
 */
public class ConcreteComponent extends Component{

	public ConcreteComponent(String name) {
		super(name);
	}

	private List<Component> components = new ArrayList<Component>();
	
	@Override
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		components.remove(component);
	}

	@Override
	public void display(int layer) {
		System.out.println(getLayerString(layer) + getName());
		layer = layer + 1;
		for (Component component : components) {
			component.display(layer);
		}
	}
	
}
