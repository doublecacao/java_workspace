package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와, 평균을 출력
		 * 최고점수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 학생의 점수를 입력하세요> ");
		int a = sc.nextInt();
		
		System.out.print("두번째 학생의 점수를 입력하세요> ");
		int b = sc.nextInt();
		
		System.out.print("세번째 학생의 점수를 입력하세요> ");
		int c = sc.nextInt();
		
		System.out.print("네번째 학생의 점수를 입력하세요> ");
		int d = sc.nextInt();
		
		System.out.print("다섯번째 학생의 점수를 입력하세요> ");
		int e = sc.nextInt();
		
		int arr[] = new int[] {a, b, c, d, e};
		
		int sum=0;
		int min=0;
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			min = Math.min(max, arr[i]);
		}
		

		double avr = (double) sum/arr.length;
		
		
		System.out.println("합계 : "+sum+"\n평균 : "+avr+" 이며,");
		
		if(max==a) {
			System.out.println("최고점수를 받은 학생은 첫번째 학생 입니다.");
		}
		else if(max==b) {
			System.out.println("최고점수를 받은 학생은 두번째 학생 입니다.");
		}
		else if(max==c) {
			System.out.println("최고점수를 받은 학생은 세번째 학생 입니다.");
		}
		else if(max==d) {
			System.out.println("최고점수를 받은 학생은 네번째 학생 입니다.");
		}
		else if(max==e) {
			System.out.println("최고점수를 받은 학생은 다섯번째 학생 입니다.");
		}
		else System.out.println("오류");
		
		
		if(min==a) {
			System.out.println("최저점수를 받은 학생은 첫번째 학생 입니다.");
		}
		else if(min==b) {
			System.out.println("최저점수를 받은 학생은 두번째 학생 입니다.");
		}
		else if(min==c) {
			System.out.println("최저점수를 받은 학생은 세번째 학생 입니다.");
		}
		else if(min==d) {
			System.out.println("최저점수를 받은 학생은 네번째 학생 입니다.");
		}
		else if(min==e) {
			System.out.println("최저점수를 받은 학생은 다섯번째 학생 입니다.");
		}
		else System.out.println("오류");

		
		sc.close();
	}

}
