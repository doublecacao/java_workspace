package day06;

import java.util.Random;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력 (숫자, 문자 상관없음)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위 => 결과 : 무승부
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("가위, 바위, 보 게임을 시작하시겠습니까? (y/n) ");
		char start = sc.next().charAt(0);
		
		if (start=='y') {
		System.out.print("가위, 바위, 보 중 입력해주십시오> ");
		String choice = sc.next();
		
		int com = (int)(Math.random()*3)+1;					//1=가위, 2=바위, 3=보
	
			switch(choice) {
			case "가위":{
				if(com==1) {
					System.out.println("결과=> 컴퓨터 > 가위, 나 > "+choice+" => 결과 : 무승부");
				}
				else if(com==2) {
					System.out.println("결과=> 컴퓨터 > 바위, 나 > "+choice+" => 결과 : 패배");
				}
				else if(com==3) {
					System.out.println("결과=> 컴퓨터 > 보, 나 > "+choice+" => 결과 : 승리");
				}
				break;
			}
			case "바위":{
				if(com==1) {
					System.out.println("결과=> 컴퓨터 > 가위, 나 > "+choice+" => 결과 : 승리");
				}
				else if(com==2) {
					System.out.println("결과=> 컴퓨터 > 바위, 나 > "+choice+" => 결과 : 무승부");
				}
				else if(com==3) {
					System.out.println("결과=> 컴퓨터 > 보, 나 > "+choice+" => 결과 : 패배");
				}
				break;
			}
			case "보":{
				if(com==1) {
					System.out.println("결과=> 컴퓨터 > 가위, 나 > "+choice+" => 결과 : 패배");
				}
				else if(com==2) {
				System.out.println("결과=> 컴퓨터 > 바위, 나 > "+choice+" => 결과 : 승리");
				}
				else if(com==3) {
					System.out.println("결과=> 컴퓨터 > 보, 나 > "+choice+" => 결과 : 무승부");
				}
				break;
			}
			default:
		}
		// ==은 문자열이 비교가 안된다 equals를 사용해야함
		}
		else if(start=='n') {
			System.out.println("게임을 종료합니다.");
		}
		
		sc.close();
		
	}

}
