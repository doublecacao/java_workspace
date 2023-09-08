package customer;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 고객 클래스
		 * Silver고객 / Gold고객 / VIP고객
		 * 
		 * 멤버변수 
		 * 고객ID : int customerID
		 * 고객이름 : String customerName
		 * 고객등급 : String customerGrade
		 * 보너스포인트 : int bonusPoint
		 * 보너스포인트적립비율 : double bonusRatio
		 * 
		 * -Customer 객체 생성시
		 * 기본 customerGrade = Silver
		 * 기본 bonusRatio = 1% 적립
		 * 
		 * -메서드
		 * -보너스 적립 계산 메서드(메서드 명 : calcPrice(int price))
		 * 	=> 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴
		 * 	구매금액을 주고, 적립보너스 계산, bonusPoint 누적, 실 구매금액 리턴
		 * 
		 * -출력메서드(메서드명 : customerInfo())
		 * 	홍길동님의 등급은 VIP이며, 보너스 포인트는 1000점입니다.
		 * 	전담 상담사 번호는 1111입니다. -VIP만 출력
		 * 
		 * -Silver등급
		 * 	제품을 살때 할인 없음. / 보너스 포인트 1%적립
		 * 
		 * -Gold등급
		 * 	제품을 구매할때 10% 할인 / 보너스 포인트 2%적립
		 * 
		 * -VIP등급
		 * 	제품을 구매할때 20% 할인 / 보너스 포인트 5%적립
		 * 	전담상담사를 갖는다. (int agentID)
		 */
		
		
		customer SONG = new customer(1001, "송");
		customer YEONG = new GoldCustomer(1002, "영");
		customer GEON = new VIPCustomer(1003, "건");
		
		int price = 10000;
		
		System.out.println("지불금액:"+SONG.calcPrice(price));
		SONG.customerInfo();
		
		System.out.println("지불금액:"+YEONG.calcPrice(price));
		YEONG.customerInfo();
		
		System.out.println("지불금액:"+GEON.calcPrice(price));
		GEON.customerInfo();
		
	}
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	
	public customer() {}
	public customer(int id, String name) {	//생성자는 초기값을 정해주는 역할을 한다.
		this.customerID = id;
		this.customerName = name;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	

	
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"점입니다.");
	}
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		
		return price;
	}
	
}



class GoldCustomer extends customer{	//customer 클래스의 변수 및 메소드, 생성자 사용 가능
	private double saleRatio;

	
	
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}



	@Override
		public void customerInfo() {		//상속받은 클래스 메소드의 오버라이딩은 같은 명령어로 다른 수행을 처리하고싶을때 한다.
			super.customerInfo();
		}
	@Override
		public int calcPrice(int price) {		//부모클래스의 calcPrice와는 다르게 saleRatio가 추가되었기 때문에 오버라이딩 처리
		bonusPoint += (int)(price*bonusRatio);
		price = price-(int)(price * saleRatio);
		
		return price;
		}
	
	
	
	public double getSaleRatio() {				//getter와 setter는 생성자로 정해주는 값 이외에 다른 값으로 변경 가능성이 있으면 선언해준다.
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}




class VIPCustomer extends customer{
	private int agentID;
	private double saleRatio;

	
	public VIPCustomer() {}
	public VIPCustomer(int id, String name) {	//변할 가능성이 있는 변수는 매개변수로 넣어준다.
		super(id, name);						//부모클래스의 생성자를 호출하고
		customerGrade = "VIP";					//변경하고싶은 변수는 값을 덧씌워준다
		bonusRatio = 0.05;
		saleRatio = 0.2;
		agentID = 1111;
	}
	
	
	
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("전문 상담사 번호는 "+agentID+" 입니다.");
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price*bonusRatio);
		price = price-(int)(price*saleRatio);
		
		return price; 
	}
	
	
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}