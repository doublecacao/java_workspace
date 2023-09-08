package day12;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EzenStudent ES = new EzenStudent("인천", "송영건", "자바", "01053515284");
		ES.print();
		//객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(ES);
		
		EzenStudent ES2 = new EzenStudent();
		ES2.print();
	}

}
/* 객체를 초기화 하는 방법 : 기본값(null, 0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2. 초기화 블럭 : {} 멤버변수를 초기화
 * 3. 생성자 : 객체를 초기화 하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자
 */

/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자
 * 메서드 : 출력 (print메서드) => toString메서드
 * getter/setter
 */

class EzenStudent{
	private String branch;
	private String name;
	private String stuClass;
	private String phone;
	
	
	
	{
		//초기화 블럭
		branch="incheon";
		stuClass="미정";
	}
	
	
	
	EzenStudent(){}
	EzenStudent(String branch, String name, String stuClass, String phone){
		this.branch = branch;
		this.name = name;
		this.stuClass = stuClass;
		this.phone = phone;
	}
	
	
	
	public void print() {
		System.out.println("지점:"+branch+" 이름:"+name+" 반:"+stuClass+" 전화번호:"+phone);
	}
	
	
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", stuClass=" + stuClass + ", phone=" + phone + "]";
	}
	
}