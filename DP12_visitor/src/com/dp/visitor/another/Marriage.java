package com.dp.visitor.another;

/**
 * ��������߽�ɫB:���״̬
 * @author zhang
 *
 */
public class Marriage implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " ��״̬�� " + man.getClass().getSimpleName() + " �иŵ���������Ϸ�ս�ʱ��������ͽ�̡�������");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " ��״̬�� " + woman.getClass().getSimpleName() + " ��οԻ�����鳤��·�������������ձ���ȫ");
	}

}
