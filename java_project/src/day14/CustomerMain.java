package day14;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		
		Customer cLee = new Customer(1001, "리정혁");
		Customer cHong = new GoldCustomer(1002, "홍길동");
		Customer cKim = new VIPCustomer(1003, "김철수", 1111);
		
		int cnt=0;
		customerList[cnt]=cLee;
		cnt++;
		customerList[cnt]=cHong;
		cnt++;
		customerList[cnt]=cKim;
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌 자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		//반드시 명시적으로 형변환을 해야함
		//instanceof 원래 그 형태가 맞는지 체크하는 명령어 true/false
		
//		int price = cKim.calcPrice(10000);
//		System.out.println("지불금액: "+price);
//		cKim.customerInfo();
		
		
		System.out.println("---고객 정보 출력---");
		//for문을 활용한 고객정보 출력
		for(int i=0; i<=cnt; i++) {
			customerList[i].customerInfo();
		}
		
		System.out.println("---할인율과 포인트 계산---");
		int price = 100000;
		//홍길동님이 지불하실 금액은 000원입니다. / 보너스포인트는 000원입니다.
		for(int i=0; i<=cnt; i++) {
			System.out.println(customerList[i].customerName+"님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"원입니다.");
			System.out.println("보너스포인트는 "+customerList[i].bonusPoint+"원입니다.");
		}
		
		System.out.println("---고객 정보 출력---");
		//for문을 활용한 고객정보 출력
		for(int i=0; i<=cnt; i++) {
			customerList[i].customerInfo();
		}
		
		for(int i=0; i<=cnt; i++) {
			if(customerList[i] instanceof VIPCustomer) {
				VIPCustomer v = (VIPCustomer)customerList[i];
				if(v.getAgentID()==1111) {
					v.setAgentID(3333);
					v.customerInfo();
				}
			}
		}
	}
}
