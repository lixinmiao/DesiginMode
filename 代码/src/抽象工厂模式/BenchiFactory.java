package 抽象工厂模式;

public class BenchiFactory implements AbstractFactory{

	@Override
	public Door doorProduce() {
		// TODO Auto-generated method stub
		return new BenchiDoor();
	}

	@Override
	public Window windowProduce() {
		// TODO Auto-generated method stub
		return new BenchiWindow();
	}

}
