package com.dp.visitor.another;

/**
 * ��������߽�ɫA������״̬
 * @author zhang
 *
 */
public class Love implements Status {

	@Override
	public void mind(Man man) {
		System.out.println(this.getClass().getSimpleName() + " ��״̬�� " + man.getClass().getSimpleName() + " ���ǲ���ҲҪװ��");
	}

	@Override
	public void mind(Woman woman) {
		System.out.println(this.getClass().getSimpleName() + " ��״̬�� " + woman.getClass().getSimpleName() + " ���¶�Ҳװ������");
	}

}
