package 单例模式;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 双重检查加锁
 * @author HL-meng
 *
 */
public class Singleton {

	public static Singleton instance=null;


	/**
	 * 私有构造函数
	 */
	private Singleton(){}

	public static Singleton getInstance()
	{
		if(instance==null)
		{
			synchronized(Singleton.class)
			{
				if(instance==null)
				{
					instance=new Singleton();
				}
			}
		}
		return instance;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
