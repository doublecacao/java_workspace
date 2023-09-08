package day05;

public class string02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 이것이 자바다.txt => 파일명과 확장자를 분리하여 출력
		 * 
		 */
		String fileName = "이것이자바다.txt";
		String file = fileName.substring(0, fileName.indexOf("."));
		System.out.println("file: "+file);
		
		String sux = fileName.substring(fileName.indexOf("."));
		System.out.println("확장자: "+sux);
		
		//contains(str): 해당글자를 포함하는지 체크후 boolean값 반환
		String s = "abc";
		System.out.println(s.contains("ab"));
	}

}
