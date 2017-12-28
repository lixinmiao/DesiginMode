package 命令模式;

public class Keypad {
	private Command playCommand;

	public Command getPlayCommand() {
		return playCommand;
	}

	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	
	public void play()
	{
		this.playCommand.execute();
	}
}
