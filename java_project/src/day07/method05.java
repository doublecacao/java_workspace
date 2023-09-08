package day07;

import java.util.Scanner;

public class method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2~100 까지의 소수를 출력
		 * 2~100 까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 */
		for(int i=2; i<=100; i++) {
			if(cal(i)) System.out.print(i+" ");
		}
		System.out.println();
		
		// 2~100까지의 소수의 합계
		int sum=0;
		for(int i=2; i<=100; i++) {
			if(cal(i)) {
				sum += i;
			}
		}
		System.out.println("소수의 합계 = "+sum);
		
		// 값을 입력받아서 소수인지 아닌지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수를 입력해주세요> ");
		
		int ins = sc.nextInt();
		
		if(cal(ins)) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		
		sc.close();
	}
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true/false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int i
	 * 메서드명 : cal
	 */
	
	public static boolean cal(int i) {
		int cnt = 0;
			
		for(int k=1; k<=i; k++) {
			if(i%k==0) {
				cnt++;
			}
		}
		if(cnt==2) {
				return true;
		}
		else 
			return false;
	}
}
