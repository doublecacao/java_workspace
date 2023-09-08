package lottomanagerMy;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LottoManager lm = new LottoManager();
		
		int menu = 0;
		
		do {
			System.out.println("--로또프로그램--");
			System.out.println("1.로또번호생성(수동)|2.로또번호생성(자동)|3.당첨번호생성(자동)|4.당첨번호내역확인|5.당첨번호리스트확인|6.종료");
			System.out.print("메뉴 선택> ");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 입력 분기구현
			switch(menu) {
			case 1:	
				System.out.println("로또번호생성(수동)");
				lm.createLotto(scan);
				break;
			case 2:	
				System.out.println("로또번호생성(자동)");
				lm.createLottoAuto();
				break;
			case 3:	
				System.out.println("당첨번호생성(자동)");
				lm.insertLottoAuto();
				break;
			case 4:	
				System.out.println("당첨번호내역확인");
				lm.checkLotto();
				break;
			case 5:	
				System.out.println("당첨번호리스트확인");
				lm.printLotto();
				break;
			case 6: break;
			default: System.out.println("잘못된 메뉴~!!");
			}
		}while(menu!=6);
			System.out.println("프로그램 종료");
			scan.close();
		
	}

}
