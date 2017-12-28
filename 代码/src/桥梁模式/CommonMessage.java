package 桥梁模式;

public class CommonMessage extends AbstractMessage{

	public CommonMessage(MessageImplementor impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sendMessage(String message,String user)
	{
		message = "一般：" + message;
		super.sendMessage(message, user);
	}

}
