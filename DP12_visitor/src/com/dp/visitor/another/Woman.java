package com.dp.visitor.another;

/**
 * ����Ԫ�ؽ�ɫB��Ů��
 * @author zhang
 *
 */
public class Woman implements Person{

	@Override
	public void walkToStatus(Status status) {
		System.out.println(this.getClass().getSimpleName() + " ���� "+ status.getClass().getSimpleName() +" ��״̬");
		status.mind(this);
	}

}
