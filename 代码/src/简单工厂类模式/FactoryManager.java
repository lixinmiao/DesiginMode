package 简单工厂类模式;

public class FactoryManager {
	public static Product produce(String type)
	{
		Product product=null;
		if("car".equalsIgnoreCase(type))
		{
			product=new Car();
		}
		else if("plane".equalsIgnoreCase(type))
		{
			product=new Plane();
		}
		else
		{
			
		}
		return product;
	}
}
