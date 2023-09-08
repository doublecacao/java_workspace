package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * / %
		 * ex)
		 * 3 2 + => 3+2=5
		 * 6 3 / => 6/3=2
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력~!!
		 * */
		
		int num1, num2;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 -> ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 -> ");
		num2 = scan.nextInt();
		
		System.out.print("연산자 입력 -> ");
		str = scan.next();
		
		
		if (str.equals("+")) {
			System.out.println(num1 + str + num2 + "=" + (num1 + num2));
		}
		else if (str.equals("-")) {
			System.out.println(num1 + str + num2 + "=" + (num1 - num2));
		}
		else if (str.equals("*")) {
			System.out.println(num1 + str + num2 + "=" + (num1 * num2));
		}
		else if (str.equals("/")) {
			System.out.println(num1 + str + num2 + "=" + (num1 / num2));
		}
		else if (str.equals("%")) {
			System.out.println(num1 + str + num2 + "=" + (num1 % num2));
		}
		else System.out.println("잘못된 입력~!!");
		
		scan.close();
	}

}
