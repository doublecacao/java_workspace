package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 국어, 영어, 수학 점수를 입력받아서
			 * 합계와, 평균, 평가를 출력
			 * 평가는 평균이 90이상이면 A
			 * 80 이상이면 B
			 * 70 이상이면 C
			 * 나머지는 D
			 * 
			 * 
			 * 입력받는 값이 0보다 작거나 100보다 크면 잘못된 값 이라는 문자열 출력
			 */
		
		int sum;
		char rank;
		double avg;
		boolean bool;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 -> ");
		int kor = scan.nextInt();
		
		if(kor < 0 || kor > 100) {
			bool = true;
			while(bool) {
			System.out.println("잘못된 값");
			System.out.print("국어 점수를 입력해주세요 -> ");
			kor = scan.nextInt();
			
			if(kor >= 0 && kor <= 100)
				bool = false;
			}
		}
		
		
		System.out.print("영어 점수를 입력해주세요 -> ");
		int eng = scan.nextInt();
		
		if(eng < 0 || eng > 100) {
			bool = true;
			while(bool) {
			System.out.println("잘못된 값");
			System.out.print("영어 점수를 입력해주세요 -> ");
			eng = scan.nextInt();
			
			if(eng >= 0 && eng <= 100)
				bool = false;
			}
		}
		
		
		System.out.print("수학 점수를 입력해주세요 -> ");
		int math = scan.nextInt();
		
		if(math < 0 || math > 100) {
			bool = true;
			while(bool) {
			System.out.println("잘못된 값");
			System.out.print("수학 점수를 입력해주세요 -> ");
			math = scan.nextInt();
			
			if(math >= 0 && math <= 100)
				bool = false;
			}
		}
		
		
		sum = kor + eng + math;
		avg = (double)(sum)/3;
		
		if(avg >= 90) {
			rank = 'A';
			System.out.println("합계 :" + sum + "\n평균 :" + avg + "\n평가 :" + rank);
		}
		
		else if(avg >= 80) {
			rank = 'B';
			System.out.println("합계 :" + sum + "\n평균 :" + avg + "\n평가 :" + rank);
		}
		
		else if(avg >= 70) {
			rank = 'C';
			System.out.println("합계 :" + sum + "\n평균 :" + avg + "\n평가 :" + rank);
		}
		
		else {
			rank = 'D';
			System.out.println("합계 :" + sum + "\n평균 :" + avg + "\n평가 :" + rank);
		}
		
		scan.close();
	}

}
