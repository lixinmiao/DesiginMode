package 工厂方法模式;

/**
 * 抽象工厂类
 * @author HL-meng
 *
 */
public interface Factory {

	//Product 抽象产品
	//type是产品细分小类
	Product produce(String type);
	
}

