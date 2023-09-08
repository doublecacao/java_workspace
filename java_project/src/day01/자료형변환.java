package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자료형 변환 : casting
		 * 자료형(변수의 타입)
		 * a = b a의 자료형과 b의 자료형이 맞지않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황
		 * 크기가 큰 자료형 = 크기가 작은 자료형
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입)
		 */
		
		byte num = 10;
		int num1 = num; // int = byte (자동 형변환 가능)
		System.out.println(num1);
		
		
		
		double num2 = 10.2;
		num1 = (int)num2; // int = double (명시적 형변환)
		System.out.println(num1);
		
		int num3 = (int)1.2;
		System.out.println(num3);
		
		/* 국어, 영어, 수학 세값의 합계와 평균을 출력 (소수점 살려서)
		 * 
		 */
		int kor = 85, eng = 95, math = 44;
		
		int sum = kor+eng+math;
		float ave = (float)sum/3;
		//자료형이 실수형이고, 나누는 값이 0이면 -> 무량대수(Infinity)
		//자료형이 정수형이고, 나누는 값이 0이면 -> 예외발생(Exeption) .
		System.out.println("합계="+sum+"\n평균="+ave);
	}

}
