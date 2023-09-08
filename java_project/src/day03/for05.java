package day03;

import java.util.Scanner;

public class for05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 10 : 10 20 30 40 50 ...
		 * 15 : 15 30 45 60 ...
		 * 공배수 : 30 60 ...
		 * 최소 공배수 : 30
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i=num1; ; i+=num1){							//i에 계속해서 곱하게 해주는 식
			if(i%num1==0 && i%num2==0) {					//커지는 i값을 입력된 숫자로 나눠서 동시에 0이 되는 수
				System.out.println("두 수의 최소공배수 : " + i);
			break;
			}
		}
		
		
		sc.close();
	}

}
