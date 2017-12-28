package 建造者模式;

public class 建造者模式Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
	}

}
