package day13;

public class 인터페이스01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것.
		 * 추상메서드 : 선언부만있고, 구현은 없는 메서드
		 * 키워드 : abstract이지만 인터페이스에서는 키워드를 안붙여도 상관없음.
		 * 
		 * interface 인터페이스명{
		 * 	-기능 요약서
		 * 	-자체적으로 사용할수는 없고, 인터페이스를 구현한 클래스로 활용
		 * 	-구현 키워드 : implements
		 * 	-인터페이스는 멤버변수가 없음.
		 * }
		 * -상속은 단일상속이 원칙.
		 * -구현은 여러개 가능.
		 */
		
		TV tv = new TV();
		tv.turnOn();
		tv.chUp();
		tv.chDown();
		tv.chDown();
		tv.turnOff();
	}

}

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{
	void chUp();
	void chDown();
}
class TV implements Power, Remocon{		//다중 구현 가능.
	private boolean power;
	private int ch;
	
	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		if(power) {
			ch++;
			if(ch>50) {
				ch=1;
				System.out.println("현재 채널 : "+ch);
			}else {
				System.out.println("현재 채널 : "+ch);
			}
		}
	}

	@Override
	public void chDown() {
		if(power) {
			ch--;
			if(ch<1) {
				ch=50;
				System.out.println("현재 채널 : "+ch);
			}
			else {
				System.out.println("현재 채널 : "+ch);
			}
		}
	}

	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
		
	}
	
}
