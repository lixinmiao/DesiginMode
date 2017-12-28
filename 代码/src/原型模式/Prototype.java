package 原型模式;

/**
 * 抽象原型
 * @author HL-meng
 *
 */
public interface Prototype {
	/**
	 * 克隆自身的方法
	 * @return 一个从自身克隆出来的对象
	 */
	public Prototype clone();
}
