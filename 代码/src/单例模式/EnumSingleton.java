package 单例模式;

/**
 * 枚举单例
 * @author HL-meng
 *
 */

public class EnumSingleton {

	public enum Singleton
	{
		INSTATNCE;
		private  EnumSingleton instance;
		private Singleton()
		{
			instance=new EnumSingleton();
		}
		public EnumSingleton getInstance() {
	        return instance;
	    }
	}
	
	public static void main(String[] args)
	{
		Singleton.INSTATNCE.getInstance();
	}
}
