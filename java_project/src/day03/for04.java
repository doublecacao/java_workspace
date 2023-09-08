package day03;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*최대공약수 찾기
		 * 약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수 : 두 정수의 공통된 약수
		 * 최대공약수 : 공약수 중 가장 큰 값
		 * 8 : 1 2 4 8
		 * 12 : 1 2 3 4 6 12
		 * 공약수 : 1 2 4
		 * 최대공약수 : 4
		 */
		
		// 두 정수 num1 , num2를 입력받아 최대 공약수를 출력
		// 제일 높은 수에서 최대공약수를 구하는 방법 : 맨 처음에 공약수를 구하는 즉시 break를 이용해 탈출하는 방법
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수를 입력해주세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수를 입력해주세요 : ");
//		int num2 = sc.nextInt();
//		
//		for(int i=num1;;i--) {
//				if(num1%i==0 && num2%i==0) {
//					System.out.println("두 수의 최대공약수 : " + i);
//					break;
//			}
//		}
//		
//		sc.close();
		
		
		//제일 낮은 수에서 최대공약수를 구하는 방법 : 변수에 공약수를 계속 덮어씌워서 마지막 공약수를 구하는 방법
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수를 입력해주세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수를 입력해주세요 : ");
//		int num2 = sc.nextInt();
//		
//		int k=0;
//		for(int i=1; i<=num1; i++) {
//			if(num1%i==0 && num2%i==0) {
//				k=i;
//			}
//		}
//		System.out.println("두 수의 최대공약수 : " + k);
//		
//		sc.close();
		
		
//		int i=0;
//		a :for(;;) {
//			for(;;) {
//				for(;;) {
//					for(;;) {
//						for(;;) {
//							i++;
//							if(i==10) {
//								System.out.println("벗어나기");
//								break a;
//							}
//						}
//					}
//				}
//			}
//		}
//		
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * break;
		 * 중첩 for문일경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
		 */
	}

}
