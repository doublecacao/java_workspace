package lottomanager;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	//사용자 번호를 출력하는 로또 클래스(상속을 해줘야 함.)
	protected int numbers[] = new int[6];
	
	//메서드
	//1. random 번호를 생성
	//Random().nextInt(범위)+시작값 => 랜덤 메서드
	protected int random() {
		return new Random().nextInt(45)+1;
	}
	
	//2. 랜덤번호 6개 numbers에 저장하는 메서드(중복x)
	protected void randomLotto() {
		//초기화
		init();
		int cnt=0;
		while(cnt<6) {
			int r = random();
			if(!isContain(r)) {	//중복되지않는다면
				numbers[cnt]=r;
				cnt++;
			}
		}
	}

	//3. 중복 체크 메서드 isContain()
	protected boolean isContain(int num) {
		if(num<0||num>45) {
			System.out.println("숫자의 범위가 1~45까지 입니다.");
			return false;
		}
		for(int tmp : numbers) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	//1 2 3 4 5 6
	//4. 배열을 초기화
	protected void init() {
		numbers = new int[6];	//기존 배열을 버리고, 새배열을 연결
		
	}

	//5. 번호 확인 => toString
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
	
	//6. 수동 번호 생성
	//입력은 manager class에서 받아서 -> 메서드 호출
	//매개변수로 배열을 주면, numbers로 복사
	protected void insertNumbers(int arr[]) {
		if(arr.length < numbers.length) {
			System.out.println("배열의 길이가 작습니다.");
		}
		//배열 복사 arraycopy => 처리속도가 빠름
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}
	
	//getter
	public int[] getNumbers() {
		return numbers;
	}
}
