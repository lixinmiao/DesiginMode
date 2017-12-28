package 工厂方法模式;

public class PlaneFactory implements Factory{

	@Override
	public Product produce(String type) {
		// TODO Auto-generated method stub
		if("chinaplane".equals(type))
		{
			return new ChinaPlane();
		}
		return null;
	}

}
