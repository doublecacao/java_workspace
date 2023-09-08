package day03;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* num = 6의 약수를 출력
			 * 약수 : 나누어서 떨어지는 수
			 * 6의 약수 : 1 2 3 6
			 * 12의 약수 : 1 2 3 4 6 12
			 */
//		System.out.print("6의 약수 : ");
//		for(int i=6, j=6, k=0; i>=1; i--) {
//			if(j%i==0) {
//				k=j/i;
//				System.out.print(k+" ");
//			}
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("약수를 구할 숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		
		System.out.println(num + "의 약수 : ");
		for(int i=num, j=num, k=0; i>=1; i--) {
			if(j%i==0) {
				k=j/i;
				System.out.print(k+" ");
			}
		}
		
		scan.close();
		
	}

}
