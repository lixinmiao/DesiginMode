package 建造者模式;

/**
 * 抽象建造者
 * @author HL-meng
 *
 */
public interface Builder {
	void buildPart1();//建造方法
	void buildPart2();
	Product retrieveResult();//获取产品
}
