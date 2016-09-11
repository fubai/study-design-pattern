package com.dp.command;

/**
 * ң����
 * @author zhang
 *
 */
public class Telecontroller {

	private Command turnOnCommand;
	private Command turnOffCommand;
	private Command turnChannelCommand;
	
	public Telecontroller(Command turnOnCommand, Command turnOffCommand,Command turnChannelCommand){
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
		this.turnChannelCommand = turnChannelCommand;
	}
	
	/**
	 * �򿪵���
	 */
	public void turnOn(){
		turnOnCommand.execute();
	}
	/**
	 * �رյ���
	 */
	public void turnOff(){
		turnOffCommand.execute();
	}
	/**
	 * �л�����Ƶ��
	 */
	public void turnChannel(){
		turnChannelCommand.execute();
	}
	
}
