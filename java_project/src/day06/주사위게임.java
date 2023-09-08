package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * 
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => 총 ??칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : n번
		 */
		
		Scanner sc = new Scanner(System.in);
		int num=30;
		
		for(int i=0; num>0; i++) {												//도착할때까지 주사위 반복
			
			System.out.print("던지기를 입력해주세요> ");
			String thr = sc.next();

			if(thr.contains("던지기")) {											//주사위 던지는 동작 설정		
				
				int dice = (int)(Math.random()*6)+1;							//랜덤수
				num -= dice;													//남은 거리 합산
				
				if(num>0) {														//칸 이동 출력
					System.out.println(dice+"칸 이동 => 총 "+num+"칸 남았습니다.");		
				}
				else{
					System.out.println(dice+"칸 이동 => 총 0칸 남았습니다.");
				}
			}
			else {																//주사위 던지기 이외의 행동시
				System.out.println("잘못된 값입니다.");
			}
			
			if(num<=0) {														//완주 동작
				System.out.println("도착~!! 총 이동 횟수 : "+i+"번");
			}
			
		}
		sc.close();
	}

}
