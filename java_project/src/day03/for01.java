package day03;

public class for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do ~while
		 * - for, while문은 동작방식이 같음 
		 * 		=> 조건에 맞지않으면 한번도 실행 안될 수 있음
		 * - do ~while문은 두 방식과 동작 방식이 다름 
		 * 		=> 조건에 맞지 않아도 무조건 1번은 실행 
		 * 
		 * for(초기화 ; 조건식 ; 증감식){
		 * 실행문;
		 * }
		 * 
		 * 
		 * -초기화 : 조건식이나 실행문에서 사용할 변수를 초기값을 정해주는것 : 생략 가능
		 * -조건식 : 반복문의 반복을 결정하는 식(true => 반복) : 생략 가능
		 * -증감식 : 조건식에서 사용되는 변수를 증가/감소시켜 반복횟수 조절
		 */
		
		//1~10까지 출혁하는 예제
		//초기화 : i변수 사용 => int i=1;
		//조건식 : 10이 될때까지 => i <= 10;
		//증감식 : i가 1씩 증가 => i++; (i = i + 1)
		//실행문 : i출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		
		//10부터 1까지 출혁하는 예제
		for(int o=10; o>=1; o--) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		
		
		//2부터 10까지 짝수만 출력 예제
		for(int j=1; j<=10; j++) {
			if(j%2==0) System.out.print(j+" ");
		}
		System.out.println();
		
		
		
		//1부터 20까지 중 짝수만 출력 예제
		//if문을 사용하여 조건에 맞는 자료만 출력
		for(int k=1; k<=20; k++) {
			if(k%2==0) System.out.print(k+" ");
		}
		System.out.println();
		
		
		
		
		//1부터 10까지 홀수만 출력/짝수일때는 pass~!!
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print("pass~!! ");
			}
			else if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
			
		
		
			//1부터 10까지 합계 출력
			//실행문 : 누적 더하기
			//실행 후 출력
			for(int i=1,j=0; i<=10; i++) {
				j = j+i;
				System.out.print(j+" ");
			}
			System.out.println();
			
			
			
			
			//1부터 10까지 짝수의 합과 홀수의 합을 출력
			/* for 1부터, 10까지 1씩 증가하여 값을 비교
			 * if 짝수인지 판단 => 짝수의 합계
			 * 	  홀수인지 판단 => 홀수의 합계
			 * for문 종료후 => 출력
			 */
			System.out.print("짝수합 : ");
			for(int i=1, j=0; i<=10; i++) {
				if(i%2==0) {
					j = j+i;
					System.out.print(j+" ");
				}
			}
			
			System.out.println();
			
			System.out.print("홀수합 : ");
			for(int i=1, j=0; i<=10; i++) {
				if(i%2==1) {
					j = j+i;
					System.out.print(j+" ");
				}
				
			}
			
			
			
			
			
			
			
			
			
		
	}
}
