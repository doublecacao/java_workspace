package day05;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다";	//일반 자료형처럼 이용이 가능.
		 * 
		 */
		
		String str = "Hello World~!!";
		System.out.println(str);
		
		//charAt(index) : index번지에 있는 한글자를 반환
		System.out.println("--charAt--");
		System.out.println(str.charAt(1));
		
		//length : 문자열의 전체 길이
		System.out.println("--length--");
		System.out.println(str.length());
		
		//comparTo(str) : str문자열과 비교하여 같으면 0,
		//사전순으로 앞이면 -1, 뒤면 1	//문자열 정렬시 사용
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("c"));
		System.out.println("b".compareTo("b"));
		
		//concat(str) : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		// == : 주소가 같은지 확인 / equals : 내용이 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("def"));
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능
		//찾는 문자가 없으면 -1을 리턴
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("b"));
		String email = "jerrysong2@naver.co.kr";
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf("."));
		
		//substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0,10));
		//시작번지는 포함, 끝번지는 포함X
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		//tring : 불필요한 공백 제거
		System.out.println("--tring--");
		System.out.println("       Hello        ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "JAVA"));
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(",");
		for(String s: str2) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//parseInt : 문자를 숫자로 변환
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2);
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
	}

}
