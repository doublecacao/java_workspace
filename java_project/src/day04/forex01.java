package day04;

import java.util.Scanner;

public class forex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 소수 : 약수가 1과 나자신의 수만 가지는 수를 소수
		 * 소수 : 1, 3, 5, 7, 11, 13, 17, ... 
		 */
		
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		int num=0;
//		int j=0;
//		
//		System.out.print("소수를 입력해주세요 : ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//				j++;
//			}
//		}
//		if(j==2) {
//			System.out.println("소수입니다.");
//		}
//		else {
//			System.out.println("소수가 아닙니다.");
//		}
//
//		sc.close();
	
	/* 2~100까지 중 소수를 출력*/
		for(int i=2; i<=100; i++) { 	//i=2
			int k = 0;					//i: for문이 한번 돌때마다 k초기화 
			
			for(int j=1; j<=i; j++) {	//j는 i의 숫자만큼 상승 	
				if(i%j==0) { 			//j는 i가 될때까지 계속 나눈 나머지가 0이면 if문 진입
					k++; 				//i:for문 숫자의 공약수를 구할때마다 k 증가
					if(k==2 && i==j) {	//j가 i숫자만큼 카운트를 다 했을때 공약수가 2개이면 약수 카운트, 약수를 구하는중에 k가 2가 되었을때 카운트되는 것을 방지하기 위한 i==j이다.
						System.out.print(i+" ");
					}
				}
			}
		}

		
		
		
		
		
	}
}
