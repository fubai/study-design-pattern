package com.dp.command;

/**
 * 遥控器
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
	 * 开机
	 */
	public void turnOn(){
		turnOnCommand.execute();
	}
	/**
	 * 关机
	 */
	public void turnOff(){
		turnOffCommand.execute();
	}
	/**
	 * 换频道
	 */
	public void turnChannel(){
		turnChannelCommand.execute();
	}
	
}
