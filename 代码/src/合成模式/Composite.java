package 合成模式;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	private List<Component> childComponents=new ArrayList<Component>();

	public List<Component> getChildComponents() {
		return childComponents;
	}

	private String name;

	public Composite(String name)
	{
		this.name=name;
	}

	/**
	 * 聚集管理方法，增加一个子构件对象
	 * @param child 子构件对象
	 */
	public void addChild(Component child)
	{
		childComponents.add(child);
	}

	/**
	 * 聚集管理方法，删除一个子构件对象
	 * @param index 子构件对象的下标
	 */
	public void removeChild(int index)
	{
		childComponents.remove(index);
	}

	@Override
	public void printStruct(String preStr) {
		// 先把自己输出
		System.out.println(preStr + "+" + this.name);
		//如果还包含有子组件，那么就输出这些子组件对象
		if(this.childComponents != null){
			//添加两个空格，表示向后缩进两个空格
			preStr += "  ";
			//输出当前对象的子对象
			for(Component c : childComponents){
				//递归输出每个子对象
				c.printStruct(preStr);
			}
		}

	}

}
