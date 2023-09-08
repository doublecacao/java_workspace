package day08;

import java.util.Scanner;

public class 과제 {
	static int count=0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 숫자야구
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) => 중복x
		 * user가 3자리 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 없으면 out
		 * => 3 5 7
		 *    3 6 7 => 2s
		 *    
		 *    3 5 7
		 *    3 7 6 => 1s 1b
		 *    
		 *    3 5 7
		 *    7 3 5 => 3b
		 *    
		 *    3 5 7
		 *    1 2 6 => 3o
		 *    
		 *    ----숫자야구 시작----
		 *    컴퓨터가 숫자를 정했습니다.
		 *    숫자 입력(1~9, 3자리) :
		 *    3 4 5
		 *    결과
		 *    3s 다 맞으면 종료 (게임 횟수 출력)
		 */
		int Num[] = new int [3];
		Num=randomNum();
		
		while(true) {
			compare(Num, myNum());
			if(compare(Num, myNum())==true) {
				break;
			} else if(compare(Num, myNum())==false) {
				continue;
			}
		}
		//static이 아닌 경우, 객체를 생성하여 객체명.메서드명() 호출가능
//		Lotto l = new Lotto();	//객체생성
//		l.lottoNum();			// 호출
//		l.myNum();
	}
	
	public static int[] randomNum() {
		int ran[] = new int [3];
		for(int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(ran[i]==ran[j]) {
					i--;
				}
			}
		}
		return ran;
	}
	
	public static int[] myNum() {
		int myNum[] = new int [3];
		for(int i=0; i<myNum.length; i++) {
			System.out.print((i+1)+"번째 1~9의 숫자(중복불가)를 입력해주세요> ");
			myNum[i] = sc.nextInt();
		}
		return myNum;
	}
	
	public static boolean compare(int randomNum[], int myNum[]) {
		int str, ball;
		
		while(true) {
			str=0;
			ball=0;
			
			for(int i=0; i<myNum.length; i++) {
				for(int j=0; j<myNum.length; j++) {
					if(randomNum[i]==myNum[j]&&i==j) {
						str++;
					}
					else if(randomNum[i]==myNum[j]&&i!=j) {
						ball++;
					}
				}
			}
			count++;
			
			if(str==3) {
				System.out.println("축하합니다. 총 횟수는 "+count+"회");
				return true;
			}
			else if(ball==0&&str==0) {
				System.out.println("3아웃입니다.");
				return false;
			}
			else {
				System.out.println(str+"스트라이크 "+ball+"볼입니다.");
				return false;
			}
		}
	}
}