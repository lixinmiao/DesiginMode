package 原型模式;

public class 简单原型Clent {

	/**
	 * 持有需要使用的原型接口对象
	 */
	private Prototype prototype;
	/**
	 * 构造方法，传入需要使用的原型接口对象
	 */

	public void operation()
	{
		//需要创建原型接口的对象
		Prototype copyPrototype=prototype.clone();
	}
}
