package day04;

public class while01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* while : 반복문 중 하나.
		 * while(조건식) {	//true일때 반복
		 * 	실행문;
		 * 	증감식;
		 * }
		 */
		
		
		/* 1~10까지 출력
		 * while문을 이용하여 출력
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		/* 1~10까지 짝수만 출력
		 * */
		
		int j=0;
		while(j<=10) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
		
	}

}
