package 策略模式;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO Auto-generated method stub
		System.out.println("对于初级会员的没有折扣");
        return bookPrice;
	}

}
