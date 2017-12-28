package 单例模式;
/**
 * 饿汉式单例模式
 * @author HL-meng
 *
 */
public class EagerSingleton {
	private static EagerSingleton instance=new EagerSingleton();
	/**
	 * 私有构造函数
	 */
	private EagerSingleton()
	{
		
	}
	/**
     * 静态工厂方法
     */
	public static  EagerSingleton getInstance()
	{
		return instance;
	}
}
