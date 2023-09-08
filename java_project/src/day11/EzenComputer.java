package day11;

import java.util.Scanner;

public class EzenComputer {
	static Scanner sc = new Scanner(System.in);
		/*수강관리 프로그램
		* -EzenComputer 클래스 생성
		* -학생의 기본정보 : 이름, 생년월일, 나이, 전화번호
		* -학원 정보 : 학원이름 = "EZEN", "지점"
		* -수강정보 : 수강과목, 기간(2023-08-16 ~ 2024-03-14)
		*
		* ex) 홍길동, 990101, 24, 010-1111-1111	=>학생정보 출력
     	* EZEN, 인천지점							=> 학원정보 출력
     	* 자바(6개월), DB(1개월), HTML(2개월)		=> 수강정보 출력
     	*
		* 기능
		* -학생정보 출력, 학원정보 출력, 수강정보 출력
		* -학생의 수강정보를 추가하는 기능
		*/
	
	
	
	//final => 변경불가능한
	//멤버변수 선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company = "EZEN";
	private String branch;
	//수강정보 => 한사람이 여러과목을 수강
	private String[] course = new String[5];	//수강과목 5개
	private String[] period = new String[5];	//수강기간 5개
	private int cnt;							//배열의 index 처리를 위한 변수
	private String check;
	
	
	
	//생성자
	public EzenComputer() {}
	public EzenComputer(String name, String birth, int age, String phone, String branch) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.branch = branch;
	}
	public EzenComputer(String[] course, String[] period) {
		this.course = course;
		this.period = period;
	}
	
	
	
	//메서드
	public void StuInfo() {
		System.out.println(name+", "+birth+", "+age+", "+phone);
	}
	
	public void AcaInfo() {
		System.out.println(company+", "+branch);
	}
	
	public void LearnInfo() {
		for(int i=0; i<cnt; i++) {
				System.out.print(course[i]+"("+period[i]+") ");
		}
	}
	
	
	
	//정보 출력기능 메서드
	public void StuInfoIn() {
		System.out.print("이름을 입력해주세요> ");
		name = sc.next();
		
		System.out.print("생년월일 6자리를 입력해주세요> ");
		birth = sc.next();
		
		System.out.print("나이를 입력해주세요> ");
		age = sc.nextInt();
		
		System.out.print("전화번호를 입력해주세요> ");
		phone = sc.next();
	}
	
	public void AcaInfoIn() {
		System.out.print("지점명을 입력해주세요> ");
		branch = sc.next();
	}

	public void LearnInfoIn() {
		do {
			System.out.print((cnt+1)+"번째 수강과목을 입력해주세요>");
			course[cnt] = sc.next();
		
			System.out.print((cnt+1)+"번째 과목 수강기간을 입력해주세요>");
			period[cnt] = sc.next();
			
			System.out.print("계속 입력하시겠습니까(y/n) ");
			check = sc.next();
			cnt++;
			
		}while(check.equals("y"));
	}
	
	
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
}