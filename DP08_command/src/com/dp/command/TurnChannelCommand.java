package com.dp.command;

/**
 * 换频道命令
 * @author zhang
 *
 */
public class TurnChannelCommand implements Command {

	private Tv tv;
	private int channel;
	
	public TurnChannelCommand(Tv tv,int channel) {
		this.tv = tv;
		this.channel = channel;
	}
	
	@Override
	public void execute() {
		tv.turnChannel(channel);
	}

}
