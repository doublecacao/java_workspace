package day07;

import java.util.Scanner;

public class method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메소드
		 *  ex)
		 *  3, * => ***
		 *  5, o => ooooo
		 *  7, ☆ => ☆☆☆☆☆☆☆
		 *  
		 * main에서 숫자와 기호를 입력받아 메소드호출 => 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기호를 입력해주세요> ");
		char shape = sc.next().charAt(0);
		
		System.out.print("원하는 출력량을 정해주세요> ");
		int cnt = sc.nextInt();
		
		art(cnt, shape);
		
		sc.close();
	}
	
	public static void art(int cnt, char shape) {
		for(int i=0; i<=cnt; i++) {
			System.out.print(shape);
		}
	}
}
