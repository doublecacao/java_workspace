package day07;

public class method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메서드 : 기능을 하기위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ... (실행x)
		 * }
		 * 
		 * return : 메서드의 값을 반환하고 종료하는 역할
		 * 
		 */
		
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드
		 * 
		 * 메인에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * 카페에 제출
		 */
		int ran[] = new int [5];
		ran = random();
		avr(ran);
		print(ran);
	}
	
	public static int[] random(){
		int[] ran = new int[5];
		for(int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100)+1;
		}
		
		return ran;
	}
	
	public static double avr(int random[]) {
		int sum=0;
		
		for(int i=0; i<random.length; i++) {	
			sum += random[i];
		}
		double avr = (double)sum/random.length;
		
		return avr;
	}
	
	public static void print(int random[]) {
		System.out.print("랜덤 수 : ");
		for(int i=0; i<random.length; i++) {
			System.out.print(+random[i]+" ");
		}
		System.out.println();
		System.out.print("평균 : "+ avr(random));
	}
}
