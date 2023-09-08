package day05;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19547 => 74591 => 1+9+5+4+7
		 * 한번에 입력 받아서 저장
		 */
		
		//방법1
//		Scanner sc = new Scanner(System.in);
//		
//		int arr[] = new int [5];
//
//		System.out.print("다섯자리의 숫자를 입력해주세요> ");
//		int num = sc.nextInt();
//		
//		arr[0] = num/10000%10;
//		arr[1] = num/1000%10;
//		arr[2] = num/100%10;
//		arr[3] = num/10%10;
//		arr[4] = num%10;
//		
//		for(int i=4; i>=0; i--) {
//			System.out.print(arr[i]);
//		}
//		System.out.print(" => ");
//		for(int j=4; j>=0; j--) {
//			System.out.print(arr[j]);
//			if(j>0) {
//				System.out.print("+");
//			}
//		}
//		System.out.println();
//		
//		
//		//방법2
//		a: for(int i=0; i<arr.length; i++) {
//			for(int j=10000; j>=1; j=j/10) {
//				arr[i] = num/j%10;
//				
//				for(int k=4; k>=0; k--) {
//					System.out.print(arr[k]);	
//					if(k==0) {
//						System.out.print(" => ");
//					}
//				}
//				for(int k=4; k>=0; k--) {
//					System.out.print(arr[k]);	
//					if(k>0) {
//						System.out.print("+");
//					}
//				}
//				break a;
//			}
//		}
//		sc.close();
		
		//방법3
		Scanner scan = new Scanner(System.in);
		
		System.out.print("5자리 숫자를 입력해주세요. ");
		
		
		String s = "12345";
		String s1[] = new String[5];
		
		s1 = s.split("");
		int sum = 0;
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[4-i]);
			sum += Integer.parseInt(s1[i]);
		}
		
		scan.close();
	}

}
