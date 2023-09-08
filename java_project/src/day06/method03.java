package day06;

import java.util.Scanner;

public class method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / % 만 허용
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//숫자와 연산자 입력받기
		System.out.print("첫번째 정수를 입력해주세요> ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요> ");
		int num2 = sc.nextInt();
		
		System.out.print("원하는 연산자를 설정해주세요> ");
		String str = sc.next();
		
		//switch문 이용
		switch(str) {
		case "+":
			System.out.println(cal1(num1, num2));
			break;
		case "-":
			System.out.println(cal2(num1, num2));
			break;
		case "*":
			cal3(num1, num2);
			break;
		case "/":
			cal4(num1, num2);
			break;
		case "%":
			cal5(num1, num2);
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
		
		//if문 이용
		if(str.equals("+")) {
			System.out.println(cal1(num1, num2));
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
		else {
			System.out.println("잘못된 값입니다.");
			double[] result = cal6(num1, num2);			 //배열 값 반환
			System.out.println(result[0]+" "+result[1]); //배열 값 출력
		}
		
		sc.close();
		
	}
	
	//연산자 메소드 선언
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
	
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로	리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : result
	 */
	public static double[] cal6(int num1, int num2) {	//배열 메소드
		double result[] = new double [2];
		result[0] = num1 / num2;
		result[1] = num1 % num2;
		
		return result;
	}

}
