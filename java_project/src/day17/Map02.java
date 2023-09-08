package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* map을 이용하여 과목과 점수를 입력하고,
		 * 합계와 평균을 출력
		 * --홍길동 점수
		 * 국어 89
		 * 영어 78
		 * 수학 96
		 * 합계:
		 * 평균:
		 */
		point pt = new point();
		pt.print();
		pt.avg();
	}

}


class point{
	private HashMap<String, Integer> point = new HashMap<String, Integer>();
	
	public point() {
		init();
	}
	
	
	public void init() {
		System.out.println("--홍길동 점수");
		point.put("국어", 89);
		point.put("영어", 78);
		point.put("수학", 96);
		point.put("과학", 66);
	}
	
	public void print() {
		for(String tmp : point.keySet()) {
			System.out.println(tmp+" "+point.get(tmp));
		}
	}
	public double sum() {
		int sum = 0;
		for(String tmp : point.keySet()) {
			sum += point.get(tmp);
		}
		System.out.println("합계:"+sum);
		return (double)sum;
	}
	
	public void avg() {
		double avg;
		int cnt = 0;
		Iterator<String> it = point.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			cnt++;
		}
		avg = sum()/cnt;
		System.out.println("평균:"+avg);
	}
}
