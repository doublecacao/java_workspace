package studentmanager;

import java.util.Scanner;

public class ProgramMain {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1. 학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 */
		/*-수강관리 프로그램
1. 인터페이스
	-학생 리스트 출력 메서드
	-학생 추가 메서드
	-학생 검색 메서드
	-학생 수강신청 메서드
	-학생 수강철회 메서드

2. 클래스
	-과목클래스 (한 과목의 정보를 나타내는 클래스)	
	-학생클래스 (한 학생 기본정보 + 수강클래스[5]를 포함)
	-매니저클래스 (인터페이스를 구현, 메서드 구현)
	-메인 (메뉴 생성, 콘솔에서 입력받아 메서드를 실행시키는 기능)
	*/
		StudentManager sm = new StudentManager();
		
		int menu = 0;
		
		do {
			System.out.println("--수강관리프로그램--");
			System.out.println("1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료");
			System.out.print("메뉴 선택> ");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 입력 분기구현
			switch(menu) {
			case 1:	
				System.out.println("학생등록메뉴~!!");
				sm.insertStudent(scan);
				break;
			case 2:	
				System.out.println("학생검색메뉴~!!");
				sm.searchStudent(scan);
				break;
			case 3:	
				System.out.println("학생조회메뉴~!!");
				sm.printStudent();
				break;
			case 4:	
				System.out.println("수강신청메뉴~!!");
				sm.registerSubject(scan);
				break;
			case 5:	
				System.out.println("수강철회메뉴~!!");
				sm.deleteSubject(scan);
				break;
			case 6: break;
			default: System.out.println("잘못된 메뉴~!!");
			}
		}while(menu!=6);
			System.out.println("프로그램 종료");
	}

}
