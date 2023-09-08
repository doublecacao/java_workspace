package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용
		 * 평균이 80이상이면 결과: 합격, 아니면 결과 : 불합격 출력
		 */
		
		int kor, eng, math; 		// 국어는 kor, 영어는 eng, 수학은 math 변수 선언
		kor = 95;
		eng = 90;
		math = 46; 
		/*변수값 초기화*/
		
		int sum = kor + eng + math; // 각 과목의 합계를 구하는 식
		int avg = sum/3; 			// 과목의 평균을 구하는 식
		System.out.println(avg>=80? "결과 : 합격":"결과 : 불합격");
		/*합불 여부를 알려주는 출력*/
	}

}
