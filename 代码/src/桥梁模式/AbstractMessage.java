package 桥梁模式;

public class AbstractMessage {

	MessageImplementor impl;
	
	public AbstractMessage(MessageImplementor impl)
	{
		this.impl=impl;
	}
	
	public void sendMessage(String message,String user)
	{
		this.impl.send(message, user);
	}
}
