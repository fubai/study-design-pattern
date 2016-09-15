package com.dp.command;

/**
 * 电视，接收命令
 * @author zhang
 *
 */
public class Tv {
	
	/**
	 * 频道
	 */
	private int channel;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * 开机
	 */
	public void turnOn(){
		System.out.println("开机");
	}
	/**
	 * 关机
	 */
	public void turnOff(){
		System.out.println("关机");
	}
	/**
	 * 换频道
	 */
	public void turnChannel(int channel){
		setChannel(channel);
		System.out.println("当前频道为：" + getChannel());
	}
}
