package studentmanagerMy;

import java.util.Scanner;

public abstract class StudentManager implements Program{
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * -Program 인터페이스를 구현
	 * -메서드는 interface를 구현하는 형태로...
	 * -학생 추가시 배열이 꽉 찼다면 배열을 늘려주는 기능 추가
	 */
	Student[] stu = new Student[5];
	Subject sub = new Subject();
	int cnt=0;
	
	@Override
	public void printStudent() {
		for(int i=0; i<cnt; i++) {
			System.out.println(stu[i].getStuName());
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		int i=0;
		a:for(i=0; i<stu.length; i++) {
			stu[i] = new Student();
			stu[i].setSubject(stu[i].resetSubject());
			
			System.out.print((i+1)+"번째 학생의 이름을 입력해주세요> ");
			stu[i].setStuName(scan.next());
			
			System.out.print(stu[i].getStuName()+" 학생의 학번을 입력해주세요> ");
			stu[i].setStuNum(scan.next());
			
			System.out.print(stu[i].getStuName()+" 학생의 주소를 입력해주세요> ");
			stu[i].setStuAddress(scan.next());
			
			System.out.print(stu[i].getStuName()+" 학생의 학부를 입력해주세요> ");
			stu[i].setUniName(scan.next());
			
			System.out.print(stu[i].getStuName()+" 학생의 학과를 입력해주세요> ");
			stu[i].setUniClass(scan.next());
			
			cnt++;
			
			System.out.print("학생을 계속 추가하시겠습니까(y/n) ");
			char check = scan.next().charAt(0);
			for(;;)
			if(check=='y') {
				continue a;
			}
			else if(check=='n'){
				break a;
			}else {
				System.out.println("옳바른 값을 입력해주세요");
				i--;
				continue a;
			}
		}
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.print("검색하고싶은 학생을 입력해주세요> ");
		String check = scan.next();
		
		for(int i=0; i<cnt; i++) {
					if(stu[i].getStuName().equals(check)) {
					System.out.println("이름: "+stu[i].getStuName());
					System.out.println("주소: "+stu[i].getStuAddress());
					System.out.println("학부: "+stu[i].getUniName());
					System.out.println("학과: "+stu[i].getUniClass());

					System.out.print("수강과목: ");
					for(int j=0; j<stu[i].getSubject().length; j++) 
						System.out.print(stu[i].getSubject()[j]+" ");
				}	
			}
		System.out.println();
		}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.print("신청할 수강자의 이름을 입력해주세요> ");
		String name = scan.next();
		
		for(int i=0; i<cnt; i++) {
			if(stu[i].getStuName().equals(name)) {
				stu[i].applySubject();
			}
		}
	}


	@Override
	public void deleteSubject(Scanner scan) {
		String[] change = new String[5];
		System.out.print("철회할 수강자의 이름을 입력해주세요> ");
		String name = scan.next();
		
		a:for(int i=0; i<cnt; i++) {
			if(stu[i].getStuName().equals(name)) {									//취소할 과목 입력
				for(int j=0; j<stu[i].getSubject().length; j++) {					//i번째 stu객체의 j번째 과목 찾기
					if(stu[i].cancelSubject().equals(stu[i].getSubject()[j])) {		//i번째 stu객체의 j번째 과목 찾으면 실행
						for(int k=j, c=j; k<stu[i].getSubject().length-1; k++) {	//j번째부터 수강과목 길이만큼
							if(c<stu[i].getSubject().length) {	
								c++;
							}
							change[k] = stu[i].getSubject()[c];						//한칸씩 과목 밀기
							if(k==stu[i].getSubject().length-2) {
								change[c] = "미수강";
								stu[i].setSubject(change);
							}
						}
						break a;
					}
				}
			}
		}
	}
}
