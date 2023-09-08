package day07;

import java.util.Scanner;

public class method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력해주세요> ");
		int i = sc.nextInt();
		
		dan(i);
		
		sc.close();
		
		//2~9까지 반복하여 모든 단을 출력
		for(int j=1; j<10; j++) {
			dan(j);
		}
	}
	/* 기능 : 단이 주어지면 그 단의 구구단을 출력
	 * 
	 */
	public static void dan(int i) {
		for(int k=1; k<10; k++) {
			int j=i*k;
			System.out.println(i+"*"+k+"="+j+" ");
		}
		System.out.println();
	}
	
}
