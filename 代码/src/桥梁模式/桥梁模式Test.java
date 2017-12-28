package 桥梁模式;

public class 桥梁模式Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageImplementor messageImplementor=new MessageSMS();
		
		AbstractMessage message=new CommonMessage(messageImplementor);
		
		message.sendMessage("加班申请速批","李总");
	}

}
