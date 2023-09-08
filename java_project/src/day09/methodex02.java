package day09;

public class methodex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수의 사칙 연산(+ - * / %)을 처리
		
		int a=5, b=3;
		
		methodex02 me = new methodex02();
		int c = me.plus(a, b);
		int d = me.minus(a, b);
		double e = me.multiply(a, b);
		double f = me.divine(a, b);
		double g = me.remain(a, b);
		System.out.println(c+" "+d+" "+e+" "+f+" "+g);
	}
	//사칙 연산의 메서드 생성 static 없이 생성
	
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1-num2;
	}
	
	public double multiply(int num1, int num2) {
		return (double)num1*num2;
	}
	
	public double divine(int num1, int num2) {
		return (double)num1/num2;
	}
	
	public double remain(int num1, int num2) {
		return (double)num1%num2;
	}
}
