package day08;

import java.util.Scanner;

public class Lotto {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 로또번호 생성 (1~45랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 => 사용자번호
		 * 당첨번호 => 1~45까지 7개 => 보너스번호
		 * 
		 * 로또번호 (6자리)			1 2 3 4 5 6
		 * 당첨번호 (6자리+1자리)	1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스번호
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 */
		compare(showmyNum(myNum()),showlottoNum(lottoNum()));
	}
	
	public static int[] lottoNum() {
		int[] lottonum = new int[6];
		
		for(int i=0; i<lottonum.length; i++) {
			lottonum[i] = (int)(Math.random()*45)+1;
			if(i>0) {
				while(lottonum[i]==lottonum[i-1]) {
					lottonum[i] = (int)(Math.random()*45)+1;
				}
			}
		}
		return lottonum;
	}
	
	public static int[] myNum () {
		int[] mynum = new int [7];
		
		System.out.println("로또번호를 입력해주세요(1~45)");
		for(int i=0; i<mynum.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력해주십시오> ");
			mynum[i] = sc.nextInt();
			if(i>0) {
				while(mynum[i]==mynum[i-1]) {
					System.out.print("중복되는 숫자를 입력하셨습니다."+i+"번째숫자를 다시 입력해주십시오> ");
					mynum[i] = sc.nextInt();
				}
			}
			while(mynum[i]<=0||mynum[i]>45){
				System.out.print("1~45 이외의 숫자를 입력하셨습니다. "+i+"번째숫자를 다시 입력해주십시오> ");
				mynum[i] = sc.nextInt();
			}
		}
		return mynum;
	}
	
	public static int[] showlottoNum(int showlotto[]) {
		System.out.print("로또번호: ");
		for(int i=0; i<showlotto.length; i++) {
			System.out.print(showlotto[i]+" ");
		}	
		return showlotto;
	}
	
	public static int[] showmyNum(int showmy[]) {
		System.out.print("나의 로또번호: ");
		for(int i=0; i<showmy.length; i++) {
			if(i==6) {
				System.out.print("["+showmy[i]+"]");
			}	
			else
				System.out.print(showmy[i]+" ");
		}
		System.out.println("");
		return showmy;
	}
	
	public static void compare(int myNum[], int lottoNum[]) {
		int cnt=0, bonus=0;
		for(int i=0; i<lottoNum.length; i++) {
			if(lottoNum[i] == myNum[6]) {
				bonus=1;
			}
			if(myNum[i]==lottoNum[i]) {
				cnt++;
			}
		}
		switch(cnt) {
		case 3:
			System.out.println("5등");
			break;
		case 4:
			System.out.println("4등");
			break;
		case 5:
			if(bonus==1) {
				System.out.println("2등");
			}
			System.out.println("3등");
			break;
		case 6:
			System.out.println("1등");
			break;
			default:
				System.out.println();
				System.out.println("꽝");
				break;
		}
	}
}
