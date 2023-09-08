package studentmanagerMy;

public class Subject {
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 * -과목코드, 과목명, 학점, 수강시간, 교수명, 학기, 시간표
	 * -멤버변수 선언, 생성자, getter/setter, 그외 필요한 메서드
	 * -(toString, print메서드 정도)
	 * 
	 */
	
	private String teacherName;		//교수명
	private String subjectName;		//과목명
	private String timeChart;		//시간표
	private int subjectCode;		//과목코드
	private int subjectPoint;		//학점
	private int learnningTime;		//수강시간
	private int semester;			//학기
	
	
	
	
	Subject(){}
	Subject(int subjectCode, String subjectName, int subjectPoint, int learnningTime, String teacherName, String timeChart, int semester){
		this.subjectCode=subjectCode;
		this.subjectName=subjectName;
		this.subjectPoint=subjectPoint;
		this.learnningTime=learnningTime;
		this.teacherName=teacherName;
		this.timeChart=timeChart;
		this.semester=semester;
	}
	
	
	
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getTimeChart() {
		return timeChart;
	}
	public void setTimeChart(String timeChart) {
		this.timeChart = timeChart;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getSubjectPoint() {
		return subjectPoint;
	}
	public void setSubjectPoint(int subjectPoint) {
		this.subjectPoint = subjectPoint;
	}
	public int getLearnningTime() {
		return learnningTime;
	}
	public void setLearnningTime(int learnningTime) {
		this.learnningTime = learnningTime;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
}
