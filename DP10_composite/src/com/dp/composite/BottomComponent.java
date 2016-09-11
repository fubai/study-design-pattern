package com.dp.composite;

/**
 * ��ײ�������û�������
 * @author zhang
 *
 */
public class BottomComponent extends Component {

	public BottomComponent(String name) {
		super(name);
	}

	@Override
	public void addComponent(Component component) {
		System.out.println("��ײ�����,������������");
	}

	@Override
	public void removeComponent(Component component) {
		System.out.println("��ײ�����,����ɾ�������");
	}

	@Override
	public void display(int layer) {
		System.out.println(getLayerString(layer) + getName());
	}

}
