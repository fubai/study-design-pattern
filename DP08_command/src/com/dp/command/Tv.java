package com.dp.command;

/**
 * 命令接收者
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
	 * 打开电视
	 */
	public void turnOn(){
		System.out.println("打开电视");
	}
	/**
	 * 关闭电视
	 */
	public void turnOff(){
		System.out.println("关闭电视");
	}
	/**
	 * 切换电视频道
	 */
	public void turnChannel(int channel){
		setChannel(channel);
		System.out.println("当前电视频道为：" + getChannel());
	}
}
