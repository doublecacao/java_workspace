package day14;

public class GoldCustomer extends Customer {
	
	
	//할인율
	private double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	
	//메서드중 할인큼액을 리턴할 수 있도록 calcPrice 메서드를 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
	}
	
}
