package 观察者模式;

public class 观察者Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		//创建观察者对象
		Observer observer = new ConcreteObserver();
		//将观察者对象登记到主题对象上
		subject.attach(observer);
		//改变主题对象的状态
		subject.change("new state");


		//创建被观察者对象
		Watched watched = new Watched();
		//创建观察者对象，并将被观察者对象登记
		java.util.Observer watcher = new Watcher(watched);
		//给被观察者状态赋值
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");
	}

}
