package com.dp.command;

public class Client {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Command turnOnCommand = new TurnOnCommand(tv);
		Command turnOffCommand = new TurnOffCommand(tv);
		Command turnChannelCommand = new TurnChannelCommand(tv,2);
		
		Telecontroller telecontroller = new Telecontroller(turnOnCommand, turnOffCommand, turnChannelCommand);
		
		telecontroller.turnOn();
		telecontroller.turnChannel();
		telecontroller.turnOff();
	}
}
