package com.dp.composite;

/**
 * 最底层的组件，没有子组件
 * @author zhang
 *
 */
public class BottomComponent extends Component {

	public BottomComponent(String name) {
		super(name);
	}

	@Override
	public void addComponent(Component component) {
		System.out.println("最底层的组件,不能添加子组件");
	}

	@Override
	public void removeComponent(Component component) {
		System.out.println("最底层的组件,不能删除子组件");
	}

	@Override
	public void display(int layer) {
		System.out.println(getLayerString(layer) + getName());
	}

}
