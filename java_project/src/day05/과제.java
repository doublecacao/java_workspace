package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가
		 * 있는 파일들을 출력하도록 코드를 작성하시오.
		 * 
		 * 제출
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg","String메서드.txt","String함수.jpg","java의 함수.png"};
		
		System.out.print("원하는 파일을 입력해주세요> ");
		String scan = sc.next();
		
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(scan)) {
				System.out.println(fileName[i]);
			}
			else {
				System.out.println("존재하지 않는 파일입니다.");
			}
		}
		sc.close();
	}
}
