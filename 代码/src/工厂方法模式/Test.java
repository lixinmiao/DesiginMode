package 工厂方法模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Factory factory=new CarFactory();
     Product product=factory.produce("baomacar");
     product.produce();
	}

}
