package day07;

import java.util.Scanner;

public class 과제 {
	//공통 변수들 선언
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 계산기 만들기
		 * (+ - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴
		 * -원하는 계산을 선택해주세요>
		 * -1.덧셈, 2.뺼셈, 3.곱셈, 4.나눗셈, 5.나머지
		 * 각 기능 메서드 => 바로 출력 (3+5=8)
		 * 
		 * 
		 * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * 
		 * 
		 * main에서 할 일
		 * 1) 1번 메서드 호출 => 숫자의 배열을 받기
		 * 2) 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3) switch(번호)
		 * 4) 기능 메서드 호출
		 */
		int num[] = num();
		choice(menu(), num);
		
	}
	public static int[] num() {
		int num[] = new int[2];
		
		System.out.print("첫번째 숫자를 입력해주세요> ");
		num[0] = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요> ");
		num[1] = sc.nextInt();
		
		return num;
	}
	
	public static int menu() {
		System.out.println("1.곱셈 2.뺄셈, 3.곱셈, 4.나눗셈, 5.나머지");
		System.out.print("원하는 메뉴를 골라주세요> ");
		int menu = sc.nextInt();
		
		return menu;
	}
	
	public static void choice(int choice, int num[]) {
		int plus = num[0]+num[1];
		int minus = num[0]-num[1];
		int multiply = num[0]*num[1];
		double divide = (double)num[0]/num[1];
		double remain = (double)num[0]%num[1];
		
		switch(choice) {
			case 1:{
				System.out.println(num[0]+"+"+num[1]+"="+plus);
				break;
			}
			case 2:{
				System.out.println(num[0]+"-"+num[1]+"="+minus);
				break;
			}
			case 3:{
				System.out.println(num[0]+"*"+num[1]+"="+multiply);
				break;
			}
			case 4:{
				System.out.println(num[0]+"/"+num[1]+"="+divide);
				break;
			}
			case 5:{
				System.out.println(num[0]+"%"+num[1]+"="+remain);
				break;
			}
			default:
				break;
		}
	}
}
