package 桥梁模式;

/**
 * 修正抽象化角色
 * @author HL-meng
 *
 */
public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}

	public void otherOperation()
	{

	}
}
