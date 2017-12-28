package 命令模式;

public class PlayCommand implements Command{

	AudioPlayer audioPlayer;
	
	public PlayCommand(AudioPlayer audioPlayer)
	{
		this.audioPlayer=audioPlayer;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.play();
	}

}
