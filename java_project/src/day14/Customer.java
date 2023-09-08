package day14;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//멤버변수 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	
	
	//생성자
	public Customer() {}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	
	
	//메서드
	//가격을 매개변수로 받아 포인트 적립 / 가격을 리턴
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		return price;
	}
	//고객 정보 출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}

	
	
	//getter/setter
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusRatio() {
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
