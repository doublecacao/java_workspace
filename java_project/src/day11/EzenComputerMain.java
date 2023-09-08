package day11;

public class EzenComputerMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EzenComputer의 객체 생성 후 출력
		EzenComputer EC1 = new EzenComputer();
		
		EC1.StuInfoIn();
		EC1.AcaInfoIn();
		EC1.LearnInfoIn();
		
		EC1.StuInfo();
		EC1.AcaInfo();
		EC1.LearnInfo();
	
		/* 학생클래스를 담을수 있는 배열을 생성 후
		 * 5명의 학생을 등록
		 * 
		 */
		
		EzenComputer[] arr = new EzenComputer[6];
		arr[0] = new EzenComputer("ㅇㅇ", "123456", 23, "211", "인천");
		arr[1] = new EzenComputer("ㄴㄴ", "654321", 24, "123", "대구");
		arr[2] = new EzenComputer("ㄷㄷ", "654123", 25, "456", "부산");
		arr[3] = new EzenComputer("ㅋㅋ", "456123", 26, "6889", "집");
		arr[4] = new EzenComputer("ㅂㅂ", "132456", 27, "2134", "지구");
		arr[5] = EC1;
		
		arr[0].StuInfo();
		arr[1].StuInfo();
		arr[2].StuInfo();
		arr[3].StuInfo();
		arr[4].StuInfo();
		arr[5].StuInfo();
		
		//향상된 for문은 완성된 배열에서만 사용가능
	}
}