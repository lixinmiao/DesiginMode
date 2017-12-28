package 工厂方法模式;

/**
 * 具体工厂类
 * @author HL-meng
 *
 */
public class CarFactory implements Factory{

	@Override
	public Product produce(String type) {
		// TODO Auto-generated method stub
		if("baomacar".equals(type))
		{
			return new BaomaCar();
		}
		else if("baomacar".equals(type))
		{
			return new BenchiCar();
		}
		return null;
	}

}
