package 命令模式;

public class 命令模式Test {

	public static void main(String[] args) {
		//创建接收者
		Receiver receiver = new Receiver();
		//创建命令对象，设定它的接收者
		Command command = new ConcreteCommand(receiver);
		//创建请求者，把命令对象设置进去
		Invoker invoker = new Invoker(command);
		//执行方法
		invoker.action();
		
		AudioPlayer audioPlayer=new AudioPlayer();
		Command playCommand=new PlayCommand(audioPlayer);
		Keypad keypad=new Keypad();
		keypad.setPlayCommand(playCommand);
		keypad.play();
	}

}
