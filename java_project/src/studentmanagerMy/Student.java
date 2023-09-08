package studentmanagerMy;

import java.util.Scanner;

public class Student {
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * -학번, 이름, 주민번호, 학부, 학과, 과목(과목클래스를 배열로 생성[5])
	 * -멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * -(학생이 수강을 신청하는 메서드, 철회하는 메서드, 기타 출력)
	 */
	Scanner scan = new Scanner(System.in);
	private String stuName;		//이름
	private String stuNum;		//학번
	private String stuAddress;		//주민번호
	private String uniName;		//학부
	private String uniClass;	//학과
	private String[] subject = new String[5];	//과목
	
	
	Student() {}
	Student(String stuName, String stuNum, String stuAddress, String uniName, String uniClass, String[] subject){
		this.stuName=stuName;
		this.stuNum=stuNum;
		this.stuAddress=stuAddress;
		this.uniName=uniName;
		this.uniClass=uniClass;
		this.subject=subject;
	}
	
	
	public String[] resetSubject() {
		for(int i=0; i<getSubject().length; i++) {
			subject[i] = "미수강"; 
		}
		return subject;
	}
		
	public String[] applySubject() {
		
		int i=0;
		
		a:for(i=0; i<getSubject().length; i++) {
			System.out.print((i+1)+"번째 수강하고싶은 과목을 입력해주세요> ");
			subject[i] = scan.next();
		
			System.out.print("수강신청을 계속 하시겠습니까(y/n) ");
			char check = scan.next().charAt(0);
			
		for(;;) {
			if(check=='y') {
				continue a;
			}
			else if(check=='n'){
				return subject;
			}else {
				System.out.println("옳바른 값을 입력해주세요");
				i--;
				continue a;
			}
		}
		}
		return subject;
	}
	
	
	
	public String cancelSubject() {
		System.out.print("철회하고싶은 과목을 입력해주세요> ");
		String cancelSub = scan.next();
		
		return cancelSub;
	}
	
	
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getUniClass() {
		return uniClass;
	}
	public void setUniClass(String uniClass) {
		this.uniClass = uniClass;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}

}
