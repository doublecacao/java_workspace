package day15;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt","String.jpg","method.png",
		 * "String.pdf","java.pdf"}
		 * 
		 * --이미지 파일--
		 * String.jpg
		 * method.png
		 * */
		과제 gz = new 과제();
		gz.fileSearch(gz.fileName());
	}
	
	public String[] fileName() {
		Scanner sc = new Scanner(System.in);
		String[] fileName =  new String[5];
		
		for(int i=0; i<fileName.length; i++) {
			System.out.print((i+1)+"번째 파일명을 입력해주세요> ");
			fileName[i] = sc.next();
		}
		return fileName;
	}
	
	public void fileSearch(String[] str) {
		for(int i=0; i<str.length; i++) {
			if(str[i].contains(".jpg")||str[i].contains(".png")||str[i].contains(".gif")||str[i].contains(".jpeg")) {			
				System.out.println("파일명 : "+str[i]);
			}
		}
	}
}