package day02;

public class IF01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 조건문 : 조건식이 참일경우 실행문을 실행하는 문
			 * if문, switch문
			 * if(조건식) { 실행문;}
			 * 실행문 한줄일 경우 {} 생략 가능 
			 * 조건식은 참일 때 실행문을 실행
			 */
		
		
		
		
		
		
		
		int num = 20;
		//num가 0보다 크면 양수
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0){
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		
		
		
		
		
		//num가 0보다 크면 양수 (10보다 크면 10보다 큽니다) / 아니면 음수 / 0이면 0입니다.
		num = 25;
		
		if(num>10) {
			System.out.println("10보다 큽니다");
		}
		else if(num<10&&num>0) {
			System.out.println("양수");
		}
		else if(num<0) {
			System.out.println("음수");
		}
		else { 
			System.out.println("0입니다");
		}
		
		
		
		
		
		
		//num2 값을 저장하고, num2가 짝수인지 홀수인지 콘솔에 찍기
		int num2 = 31;
		
		if(num2%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		
		
		
		
		//1일차 과제를 if문으로 변환
		int kor, eng, math; 		// 국어는 kor, 영어는 eng, 수학은 math 변수 선언
		kor = 95;
		eng = 90;
		math = 46; 
		/*변수값 초기화*/
		
		int sum = kor + eng + math; // 각 과목의 합계를 구하는 식
		int avg = sum/3; 			// 과목의 평균을 구하는 식
		
		if(avg>=80) {
			System.out.println("결과 : 합격");
		}
		else {
			System.out.println("결과 : 불합격");
		}
		/*합불 여부를 알려주는 출력*/
		
		
		
		
		
		
		
	}

}
