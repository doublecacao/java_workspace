package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 하루 일과를 저장하는 list를 생성 <String>
		 * 
		 */
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String scan;
		
		do {
			System.out.print("일과를 입력해주세요> ");
			list.add(sc.next());
			System.out.print("계속 입력하시겠습니까(y/n) ");
			 scan = sc.next();
		}while(scan.equals("y"));
		
		//향상된 for문으로 출력
		System.out.println("향상된 for문 출력");
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//Iterator로 출력
		System.out.println("Iterator 출력");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {	//다음요소 있는지 확인
			String tmp = it.next();	//다음요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		sc.close();
		
		//Collection.sort(list);	//오름차순
		Collections.sort(list);
		System.out.println(list);
		
		//sort(Comparator C)	//오름차순, 내림차순 가능
		list.sort(new Test());
		System.out.println(list);
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);	//내림차순
	}
	
}