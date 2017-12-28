package 观察者模式;

public interface Observer {
	/**
	 * 更新接口
	 * @param state    更新的状态
	 */
	public void update(String state);
}
