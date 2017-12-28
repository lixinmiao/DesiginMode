package 桥梁模式;

/**
 * 抽象化角色
 * @author HL-meng
 *
 */
public abstract class Abstraction {

	protected Implementor impl;

	public Abstraction(Implementor impl){
		this.impl = impl;
	}

	public void operation()
	{
		impl.operationImpl();
	}
}

