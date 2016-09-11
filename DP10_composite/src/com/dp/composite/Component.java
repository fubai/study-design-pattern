package com.dp.composite;

/**
 * ����Ļ���
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
	 * ���������
	 * @param component
	 */
	public abstract void addComponent(Component component);
	
	/**
	 * ɾ�����齨
	 * @param component
	 */
	public abstract void removeComponent(Component component);
	
	/**
	 * ��ʾ���������
	 * @param layer ��ǰ����Ĳ㼶
	 */
	public abstract void display(int layer);
	
	/**
	 * ��ȡ��ǰ�㼶��ǰ׺�ַ���
	 * @param layer ��ǰ����Ĳ㼶
	 * @return ��ǰ�㼶��ǰ׺�ַ���
	 */
	public String getLayerString(int layer){
		StringBuffer prefix = new StringBuffer();
		for(int j = 0; j < layer; j ++){
			prefix.append("-");
		}
		return prefix.toString();
	}
}
