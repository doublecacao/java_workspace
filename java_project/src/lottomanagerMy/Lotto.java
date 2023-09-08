package lottomanagerMy;

import java.util.Scanner;

public class Lotto {
	private int[] lottoNum = new int[6];
	private int[] checkNum = new int[6];
	
	
	//생성자
	public Lotto() {}
	public Lotto(int[] lottoNum, int[] checkNum) {
		this.lottoNum=lottoNum;
		this.checkNum=checkNum;
	}

	public void createLotto(Scanner scan) {
		System.out.println("수동 로또 번호를 생성합니다.");
		for(int i=0; i<lottoNum.length; i++) {			
			System.out.print((i+1)+"번째 로또 번호를 입력해주세요> ");
			lottoNum[i] = scan.nextInt();
		}
		System.out.println("생성이 완료되었습니다.");
	}
	
	public int[] lotto() {
		int[] randomNum = new int[6];
		for(int i=0; i<randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(randomNum[i]==randomNum[j]) {
					i--;
				}
			}
		}
		return randomNum;
	}
	

	
	//getter/setter

	public int[] getLottoNum() {
		return lottoNum;
	}


	public void setLottoNum(int[] lottoNum) {
		this.lottoNum = lottoNum;
	}


	public int[] getCheckNum() {
		return checkNum;
	}


	public void setCheckNum(int[] checkNum) {
		this.checkNum = checkNum;
	}
}




