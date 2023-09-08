package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 40
		 * down~!!
		 * 입력> 35
		 * 정답~!!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int com = (int)((Math.random()*50)+1);
		
		System.out.println("up/down 게임을 시작합니다.");
		System.out.println("규칙 : 1~50 사이의 랜덤수를 맞추는 게임");
		for(;;) {
			System.out.print("입력> ");
			i = sc.nextInt();
			
			if(i==com) {
				System.out.println("정답~!!");
			break;
			}
			else if(i > com) {
				System.out.println("down~!!");
			}
			else if(i < com) {
				System.out.println("up~!!");
			}
		}
		
		sc.close();
		
	}

}
