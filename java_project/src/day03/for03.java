package day03;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 구구단을 입력받아서 입력받은 단을 출력
			 * ex) 2 =>
			 * 2*1=2
			 * 2*2=4
			 * ...
			 * 2*9=18
			 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 숫자를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}		
		
		sc.close();
	}

}
