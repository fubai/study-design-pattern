package com.dp.command;

/**
 * ���������
 * @author zhang
 *
 */
public class Tv {
	
	/**
	 * Ƶ��
	 */
	private int channel;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * �򿪵���
	 */
	public void turnOn(){
		System.out.println("�򿪵���");
	}
	/**
	 * �رյ���
	 */
	public void turnOff(){
		System.out.println("�رյ���");
	}
	/**
	 * �л�����Ƶ��
	 */
	public void turnChannel(int channel){
		setChannel(channel);
		System.out.println("��ǰ����Ƶ��Ϊ��" + getChannel());
	}
}
