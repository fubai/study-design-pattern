package com.dp.composite;

/**
 * 组件抽象类
 * @author zhang
 *
 */
public abstract class Component {
	
	public Component(String name){
		setName(name);
	}
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 添加子组件
	 * @param component
	 */
	public abstract void addComponent(Component component);
	
	/**
	 * 删除子组件
	 * @param component
	 */
	public abstract void removeComponent(Component component);
	
	/**
	 * 显示所有子组件
	 * @param layer 当前的层级
	 */
	public abstract void display(int layer);
	
	/**
	 * 获取当前层级的前缀字符串
	 * @param layer 当前的层级
	 * @return 当前层级的前缀字符串
	 */
	public String getLayerString(int layer){
		StringBuffer prefix = new StringBuffer();
		for(int j = 0; j < layer; j ++){
			prefix.append("-");
		}
		return prefix.toString();
	}
}
