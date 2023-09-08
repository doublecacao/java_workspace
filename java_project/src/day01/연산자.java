package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 연산자 정리
		/* 대입 연산자 : =, +=, -=
		 * =을 기준으로 우측에 있는 값을 좌측의 변수에 저장 (덮어쓰기)
		 * a = b 는 b를 a에 대입해라 라는 의미
		 * a는 반드시 변수여야하고 b는 상관없다.
		 * 1=a (x)
		 * a += 1; => a = a+1; 기존의 a 값과 1을 더해서 a에 저장
		 */
		int a = 1;
		System.out.println(a);
		
		a = a+1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		a -= 1;
		System.out.println(a);
		
		int b = 10;
		a = b;
		System.out.println(a);
		
		
		
		
		
		//증감연산 : ++(1씩증가) --(1씩감소)
		a++; // 11
		System.out.println(a++); // 출력 후 1증가 (출력 후 12)
		System.out.println(++a); // 1증가 후 출력 (13되고 출력)
		
		
		
		
		
		//산술연산자 : + - * / %
		/* 나누기 (/)
		 * 10/3=3
		 * 10/3.0=3.333333...
		 * 20.0/3=6.31.....
		 * 20.0/3.0 = 6.31.....
		 * 값 / 0 => 예외발생
		 */
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3%2="+(3%2)); // % 나머지 연산 : 배수나 약수, 짝수나 홀수 구할 때 사용
		
		
		
		/* 비교연산자 : 비교연산의 결과는 반드시 true / false
		 * >= (이상), <=(이하), >(초과), <(미만)
		 * ==(같다), !=(같지않다)
		 * && (and), ||(or), !=(not)
		 */
		System.out.println("3>2? "+ (3>2));
		System.out.println("3<2? "+ (3<2));
		System.out.println("3==2? "+ (3==2));
		System.out.println("3!=2? "+ (3!=2));
		
		System.out.println("&& 연산자 "+ (3>2 && 4<3));
		System.out.println("|| 연산자 "+ (3>2 || 4<3));
		
		
		
		/* 조건선택 연산자 : 3항 연산자
		 * (조건식)? true : false;
		 */
		System.out.println(3>2? "참입니다.":"거짓입니다.");
		
		
		
		/* 문제 : num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 사용
		 */
		int num=5;
		System.out.println(num%2==0? "짝수":"홀수");
		//String : 문자열을 저장하는 클래스
		
		String result = (num%2==0)? "짝수":"홀수";
		System.out.println(num+"은/는 "+result);
	}

}
