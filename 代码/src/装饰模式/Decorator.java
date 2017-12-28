package 装饰模式;

public class Decorator implements Component{

	
	private Component component;
	
	
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		component.sampleOperation();
	}

}
