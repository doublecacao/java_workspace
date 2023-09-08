package day08;

import java.util.Scanner;

public class method08 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * 
		 */
		int arr[] = new int[] {1,2,9,3,7,5,6,10,4,8,13,11,12,14,15};
		printArray(attention(arr));
		printArray2(arr);
		printArray(attention(randomArray(input())));
	}
	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray()	
	 * 옆으로 출력 / 5개씩 한줄로 나열
	 */
	
	//if문
	public static void printArray(int arr[]){
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
		}
	}
	
	//2중for문
	public static void printArray2(int arr[]) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(arr[cnt]+" ");
				cnt++;
				}
			System.out.println();
			}
		}
	
	/* 주어진 정수배열을 정렬하는 기능
	 * 매개변수 int arr[]
	 * 리턴타입 : int
	 * 메서드명 : attention()
	 */
	public static int[] attention(int arr[]) {
		for(int i=1; i<arr.length; i++) { //arr[i] = arr[1]
			int j=0;
			for (int k=0; k<i; k++) {	  //arr[k] = arr[0]
				if(arr[i]<arr[k]) {		  //arr[1] < arr[0]
					j=arr[k];			  //교환
					arr[k]=arr[i];
					arr[i]=j;		
				}
			}
		}
		return arr;
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 배열개수
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray()
	 */
	public static int[] randomArray(int num) {
		int arr[] = new int [num];
		
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	public static int input() {
		System.out.print("원하는 갯수의 랜덤수를 생성해주세요> ");
		int num = sc.nextInt();
		
		return num;
	}
}
