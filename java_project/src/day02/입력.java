package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 콘솔 입력 : 콘솔에서 값을 입력 받는 것을 의미
			 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
			 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자(정수)를 입력해주세요.");
//		int num = scan.nextInt();
//		System.out.println("내가 입력한 수 : "+num);
//		
//		// 콘솔에서 숫자를 하나 입력받아 수가 짝수인지 홀수인지 출력
//		if(num % 2 == 0)
//			System.out.println("짝수");
//		else 
//			System.out.println("홀수");
//		
//		scan.close();
		
		// 숫자를 입력받아 양수인지, 음수인지, 0인지 판별하여 출력
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		
//		if(num > 0) System.out.println("양수");
//		else if(num < 0) System.out.println("음수");
//		else System.out.println("0");
//		
//		scan.close();
		
		
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		System.out.println("입력된 실수 = " + num);
		
		// next() : 문자열, charAt(index) : 문자열 중 index n번지 한글자 추출
		// index는 0번지부터 시작
		
		char ch = scan.next().charAt(0);
		
		System.out.println(ch);
		
		
		// 문자열 입력 : next () 공백 포함 안됨
		
		String s = scan.next();
		
		System.out.println(s);
		// 여러 문자 입력 : nextLine() 공백 포함
		
		
		scan.close();
		
		
		
		
	}

}
