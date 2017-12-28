package 策略模式;

public class 策略模式Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberStrategy strategy=new PrimaryMemberStrategy();
		Price price=new Price(strategy);
		double quote=price.quote(300);
		System.out.println("图书的最终价格为：" + quote);
	}

}
