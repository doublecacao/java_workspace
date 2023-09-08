package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 객체 생성
		//값을 입력 후 정보출력
		Student s1 = new Student();
		Student s2 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요> ");
		s1.setName(sc.next());
		
		System.out.print("나이를 입력해주세요> ");
		s1.setAge(sc.nextInt());
		
		System.out.print("전화번호를 입력해주세요> ");
		s1.setNumber(sc.next());

		s1.print();
		

		System.out.println();
		

		System.out.print("이름을 입력해주세요> ");
		s2.setName(sc.next());
		
		System.out.print("나이를 입력해주세요> ");
		s2.setAge(sc.nextInt());
		
		System.out.print("전화번호를 입력해주세요> ");
		s2.setNumber(sc.next());
		
		s2.print();
		
		sc.close();
		
		
		Student s3 = new Student("송영건", "인천시", "01053515284", 23);
		s3.print();
		
		Student s4 = new Student("송영건", 5);
		s4.print();
	}

}
//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름(나이) 전화번호
class Student{
	//멤버변수
	private String name;
	private String adress;
	private String number;
	private int age;
	
	//생성자 위치
	//생성자 오버로딩 가능
	public Student() {}
	public Student(String name, String adress, String number, int age) {
		//생성자 호출 - 반드시 첫줄에서만 가능.
		this.name = name;
		this.adress = adress;
		this.number = number;
		this.age = age;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name+"("+age+") "+number);
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}