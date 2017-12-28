package 单例模式;
/**
 * 懒汉式单例模式
 * @author HL-meng
 *
 */
public class LazySingleton {
	public static LazySingleton  instance;
	/**
	 * 私有构造函数
	 */
	private LazySingleton()
	{
		
	}
	/**
     * 静态工厂方法
     */
	public static synchronized LazySingleton  getInstance()
	{
		if(instance==null)
		{
			instance=new LazySingleton ();
		}
		return instance;
	}
}
