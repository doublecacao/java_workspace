package day02;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*수를 입력받아서 2의 배수가 맞으면 2의 배수입니다.
		 * 3의 배수가 맞으면 3의 배수입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력해주세요 -> ");
		int num = sc.nextInt();
		
		if (num%2==0)
			System.out.println("2의 배수입니다.");
		else if (num%3==0)
			System.out.println("3의 배수입니다.");	
		else
			System.out.println("잘못된 값입니다.");
		
		sc.close();
	}

}
