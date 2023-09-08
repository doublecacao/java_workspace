package day02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Math.method
			 *  반올림(Math.round) : 소수점의 자리수는 무조건 0
			 *  올림(Math.ceil), 버림(Math.floor)
			 *  최대값(Math.max), (최소값 Math.min)
			 *  난수(Math.random)
			 *  절댓값(Math.abs)
			 *  제곱(Math.pow), 제곱근(Math.sqrt)
			 */
		
		double num = 34.6666;
		int num1 = 5;
		int num2 = 9;
		
		
		System.out.println(Math.round(num));
		
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));
		
		System.out.println(Math.random()); //0.0포함 1.0을 미포함하는 그 사이의 난수 발생
		System.out.println((int)(Math.random()*10)+1); // 0.0*10+1=1포함 1.0*10+1=11을 미포함하는 사이의 난수 발생
		
		
		
		
	}

}
