package com.dp.visitor.another;

/**
 * ����Ԫ�ؽ�ɫA������
 * @author zhang
 *
 */
public class Man implements Person{

	@Override
	public void walkToStatus(Status status) {
		System.out.println(this.getClass().getSimpleName() + " ���� "+ status.getClass().getSimpleName() +" ��״̬");
		status.mind(this);
	}

}
