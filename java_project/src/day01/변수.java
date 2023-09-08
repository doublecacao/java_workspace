package day01;

public class 변수 {
	
	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수 선언 + 초기화
		 * 자료형(타입) 변수명 = 값;
		 */
		
		int num = 123;
		System.out.println(num);
		//System.out.println -> sysout + ctrl + space
		
		//		int num = 456; 중복선언 불가능
		
		num = 456;	// =은 우측에 있는 값을 좌측에 대입하라라는 대입연산자	
		System.out.println(num);
		
		int num1 = 78, num2 = 45, num3 = 89; // 노란색 밑줄은 한번도 사용되지 않은 변수
		
		num1 = 789;
		System.out.println(num1);
		
		//		8개의 기본 자료형은 지역변수 범위(scope) { }
		int a=0;
		if(true) {
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		//		한글자만 저장 가능 char = ' ';
		char ch = 'A';
		double doub = 3.0;
		byte b = 1;
		boolean bool = true;
		
		//		float, long 자료형은 접미사를 반드시 붙여야함 .f, .l
		float f = 1.2f;
		long l = 1l;
		
		num2 = 010; //8진수로 인식
		num3 = 0xff; // 16진수로 인식
		
		//		+ - * /(몫) %(나머지)
		//국어점수 (kor), 영어점수(eng), 수학점수(math) 변수를 선언하고 값을 입력하여 세점수의 합을 콘솔에 출력
		
		int kor=30, eng=20, math=50;
		int sum = kor+eng+math;
		System.out.println("합계점수 = " +(kor+eng+math)+" "+sum); // 연결연산자로 +를 사용하게 되면 ()로 묶어 우선순위를 바꾸면된다
		
		/*int a=5;
		 * a = a+1;
		 * a += 1; 똑같은 뜻
		 */
	}
}
