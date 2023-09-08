package day04;

public class 이중for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5*5로 별찍기
		 * 
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(i==j)
					break;
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		/*		*
		 * 	   **
		 * 	  ***
		 *   ****
		 *  *****
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//if문 이용한 방법
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
