package studentmanager;

public class Subject {
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 * -과목코드, 과목명, 학점, 수강시간, 교수명, 학기, 시간표
	 * -멤버변수 선언, 생성자, getter/setter, 그외 필요한 메서드
	 * -(toString, print메서드 정도)
	 * 
	 */
	
	private String subCode;
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subScheduler;
	
	
	
	//생성자
	public Subject() {}
	public Subject(String subName) {
		this.subName = subName;
	}
	
	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subScheduler) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subScheduler = subScheduler;
	}
	
	//메서드 (필요메서드 추가)
	
	//getter/setter
		public String getSubCode() {
			return subCode;
		}
		public void setSubCode(String subCode) {
			this.subCode = subCode;
		}
		public String getSubName() {
			return subName;
		}
		public void setSubName(String subName) {
			this.subName = subName;
		}
		public double getSubCredite() {
			return subCredite;
		}
		public void setSubCredite(double subCredite) {
			this.subCredite = subCredite;
		}
		public int getSubTime() {
			return subTime;
		}
		public void setSubTime(int subTime) {
			this.subTime = subTime;
		}
		public String getSubProfessor() {
			return subProfessor;
		}
		public void setSubProfessor(String subProfessor) {
			this.subProfessor = subProfessor;
		}
		public String getSubSemester() {
			return subSemester;
		}
		public void setSubSemester(String subSemester) {
			this.subSemester = subSemester;
		}
		public String getSubScheduler() {
			return subScheduler;
		}
		public void setSubScheduler(String subScheduler) {
			this.subScheduler = subScheduler;
		}
	
	
		
	//toString
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subScheduler="
				+ subScheduler + "]";
	}
	

}
