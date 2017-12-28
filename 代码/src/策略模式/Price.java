package 策略模式;

public class Price {
	private MemberStrategy strategy;

	public Price(MemberStrategy strategy)
	{
		this.strategy=strategy;
	}
	
	public  double quote(double booksPrice)
	{
		return this.strategy.calcPrice(booksPrice);
	}
}
