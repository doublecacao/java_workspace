package day09;

import java.util.Scanner;

public class baseballgame {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* day08 과제 -> 메서드로 변경
		 * 랜덤번호 생성
		 * 배열에 추가
		 * 출력메서드
		 * 스트라이크 메서드
		 * 볼 메서드
		 */
		System.out.print("시작 숫자를 정해주세요> ");
		int count = sc.nextInt();
		
		System.out.print("마지막 숫자를 정해주세요> ");
		int start = sc.nextInt();
		
		
		int randomNum[] = new int [3];
		int myNum[] = new int [3];
		randomNum = randomNum(count, start);
		myNum = myNum();
		
		while(true) {
			printArray(Strike(isContain(randomNum), isContain(myNum)),Ball(isContain(randomNum), isContain(myNum)));
			if(printArray(Strike(isContain(randomNum), isContain(myNum)),Ball(isContain(randomNum), isContain(myNum)))==true) {
				break;
			}
			else if(printArray(Strike(isContain(randomNum), isContain(myNum)),Ball(isContain(randomNum), isContain(myNum)))==false){
				continue;
			}
		}
	}
	/* 랜덤번호 생성 : 매개변수로 범위를 설정
	 * (int)(Math.random()*9(개수))+1(시작값);
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 시작값이 바뀌어서 들어올 때 처리
	 */
	public static int[] randomNum(int count, int start) {
		int randomNum[] = new int [3];
		
		if(count<start) {
			int change = count;
			count = start;
			start = change;
		}
		
		for(int i=0; i<randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*count)+start;
		}
		return randomNum;
	}
	
	public static int[] isContain(int randomNum[]) {
		for(int i=0; i<randomNum.length; i++) {
			for(int j=0; j<i; j++) {
				if(randomNum[i]==randomNum[j]) {
					i--;
				}		
			}
		}
		return randomNum;
	}

	
	public static boolean printArray(int str, int ball) {
		if(str==3) {
			System.out.println("축하합니다.");
			return true;
		}
		else if(str==0&&ball==0) {
			System.out.println("아웃입니다.");
			return false;
		}
		else {
			System.out.println(str+"스트라이크 "+ball+"볼입니다.");
			return false;
		}
	}
	
	public static int Strike(int randomNum[], int myNum[]) {
		int str=0;
		
		for(int i=0; i<randomNum.length; i++) {
			for(int j=0; j<i; j++) {
				if(randomNum[i]==myNum[j]&&i==j) {
					str++;
				}
			}
		}
		return str;
	}
	
	public static int Ball(int randomNum[], int myNum[]) {
		int ball=0;
		
		for(int i=0; i<randomNum.length; i++) {
			for(int j=0; j<i; j++) {
				if(randomNum[i]==myNum[j]&&i!=j) {
					ball++;
				}
			}
		}
		return ball;
	}
	
	public static int[] myNum() {
		int myNum[]	= new int [3];
		for(int i=0; i<myNum.length; i++) {
			System.out.print(i+"번째 숫자를 입력해주세요> ");
			myNum[i] = sc.nextInt();
		}
		return myNum;
	}
}
