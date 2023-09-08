package day12;

import java.util.Scanner;

public class ProductMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] arr = new Product[10];
		
		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(isMenuAdd()) {
				arr[i] = new Product();
				
				System.out.print("상품 이름을 입력해주세요> ");
				arr[i].setMenu(sc.next());
				
				System.out.print("상품의 가격을 입력해주세요> ");
				arr[i].setPrice(sc.next());
				
				cnt++;
			}
			else {
				for(int j=0; j<cnt; j++) {
					arr[j].print();
				}
				break;
			}
		}
	}
	
	public static boolean isMenuAdd() {
		String choice;
		
		while(true) {
			System.out.print("메뉴를 추가하시겠습니까(y/n)> ");
			choice = sc.next();
			
			if(choice.equals("y")) {
				return true;
			}
			else if(choice.equals("n")) {
				return false;
			}
			else
				System.out.println("잘못된 입력입니다.");
		}
	}
}
