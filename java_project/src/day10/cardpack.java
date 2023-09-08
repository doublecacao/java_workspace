package day10;

public class cardpack {
/* CardPack 클래스
 * - 카드팩 : 52장의 카드들
 * 
 * 
 * 멤버변수 : 카드를 52장 담을수 있는 배열
 * 생성자 : 52장의 카드를 모두 생성
 * 메서드 : 
 * -카드를 섞는 기능
 * -카드를 한장 빼내는 기능
 * -카드 출력 => Card클래스의 print 메서드 사용
 * -카드 초기화 메서드
 */
	//멤버변수
	private Card[] pack = new Card[52];
	private int cnt=0;	//pack 배열의 index 체크용
	
	//생성자
	public cardpack() {
		// ♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
		char shape='♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card();	//카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	//메서드
	
	//카드 섞는 기능
	public void CardShuffle() {
		for(int i=0; i<pack.length; i++) {				//pack[51]까지 반복
			int index = (int)(Math.random()*52);		//0에서부터 52미만의 랜덤수를 index변수에
			Card tmp = pack[i];							//i주소와 tmp주소에 값을 서로 교환
			pack[i] = pack[index];
			pack[index] = tmp;
		}
//		Card k;
//		
//		for(int mix=0; mix<=shuff.length; mix++) {
//			int i = (int)(Math.random()*52);
//			int j = (int)(Math.random()*52);
//			k=shuff[i];
//			shuff[i]=shuff[j];
//			shuff[j]=k;
//		}
//		return shuff;
	}
	
	//카드를 한장 빼내는 기능
	public Card CardPick() {
		if(cnt==0) {			//cnt = pack배열의 주소 => 카드를 한장 드로우 할때마다 맨 위의 카드가 줄고 0장이 되면 NULL값 반환
			return null;
		}
		cnt--;					//다음 주소로 이동하여 카드 드로우
		return pack[cnt];		//이번 카드값 반환
	}
	
	//카드 초기화 기능
	public void CardReset() {
		cnt = 52;				//pack의 주소를 다시 52번지부터 시작
	}
	
	
	
	//getter/setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
}
