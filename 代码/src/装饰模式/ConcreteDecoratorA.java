package 装饰模式;

public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		super.sampleOperation();
		
		// 写相关的业务代码
	}
}
