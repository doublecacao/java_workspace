package day06;

import java.util.Scanner;

public class method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * + 일 때 호출 => 메인에서 출력
		 * - 일 때 호출 => 메인에서 출력
		 * * 일 때 호출 => 메서드에서 출력
		 * / 일 때 호출 => 메서드에서 출력 => 리턴 double
		 * % 일 때 호출 => 메서드에서 출력
		 */
		
		//다른 클래스에 있는 메서드를 사용
		//클래스명.메서드명
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할수 있는 이유는 = static
		//(static이 없는 경우) - 선언만 해놓고 생성이 안되어있다는 것을 의미
		//객체를 생성 => 클래스가 필요
		
//		method02 me = new method02();
//		int s = me.cal1(20, 30);
//		System.out.println("me 객체 생성 후 : "+s);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 정수를 입력해주세요> ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요> ");
		int num2 = sc.nextInt();
		
		System.out.print("원하는 연산자를 설정해주세요> ");
		String str = sc.next();
		
		if(str.equals("+")) {
			System.out.println(method01.sum(num1, num2));
		}
		else if(str.equals("-")) {
			System.out.println(cal2(num1, num2));
		}
		else if(str.equals("*")) {
			cal3(num1, num2);
		}
		else if(str.equals("/")) {
			cal4(num1, num2);
		}
		else if(str.equals("%")) {
			cal5(num1, num2);
		}
		else
			System.out.println("잘못된 값입니다.");
		
		
		sc.close();
		
	}
	
	public static int cal1(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	public static int cal2(int num1, int num2) {
		int result = num1-num2;	
		return result;
	}
	
	public static void cal3(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public static void cal4(double num1, double num2) {
		System.out.println((double)(num1/num2));
	}
	
	public static void cal5(int num1, int num2) {
		System.out.println(num1%num2);
	}
}
