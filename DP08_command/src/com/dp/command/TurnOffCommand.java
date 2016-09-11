package com.dp.command;

/**
 * ¹Ø»úÃüÁî
 * @author zhang
 *
 */
public class TurnOffCommand implements Command{

	private Tv tv;
	
	public TurnOffCommand(Tv tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOff();
	}

}
