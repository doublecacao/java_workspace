package day04;

import java.util.Scanner;

public class break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문을 동반하여 조건을 만족하면 반복을 벗어나는 역할
		 * - 다중 for문에서는 나를 포함하는 for문만 벗어날 수 있음.
		 * - 바깥쪽 for문을 벗어나고 싶을 때는 for 이름을 붙여 벗어날 수 있음.
		 * 
		 * a: for(;;){
		 * 		if(){
		 * 			break a;	//a라는 이름의 for문 탈출
		 * 		}
		 * }
		 */
		
		/* 1~10까지 출력
		 * 조건식을 생략(무한루프) break를 이용하여 10이되면 벗어나게 설정
		 */
		for(int i=1; ;i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}
		}
		System.out.println(" ");
		
		
		
		
		/* 한글자를 입력받아서 글자를 그대로 출력(반복해서 출력)
		 * y를 입력받으면 종료
		 * a->a, b->b, ...y -> 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("한글자를 입력해주세요> ");
			char ch = sc.next().charAt(0);
			
			if(ch=='y') {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println(ch);
			}	
		}
		sc.close();
			
		
		
	}

}
