package day11;

public class 과제 {

public static void main(String[] args) {
      // EzenComputer의 객체 생성 후 출력
	  과제2 ez = new 과제2("홍길동","010-4444-2222","인천");
      ez.printInfo();
      ez.printCompany();   
      ez.insertCourse("java", "6개월");
      ez.insertCourse("DB", "1개월");
      ez.printCourse();
      System.out.println("=======================");
      과제2 ez2 = new 과제2("김영희","990101",24,"1111","서울");
      ez2.printInfo();
      ez2.insertCourse("java", "6개월");
      ez2.insertCourse("html", "2개월");
      ez2.printCourse();
      
      /* 학생 클래스를 담을 수 있는 배열을 생성 후
       * 5명의 학생을 등록
       * 
       * */
      과제2[] e = new 과제2[7];
      e[0] = new 과제2("영이","990101",28,"2222","인천");
      e[1] = new 과제2("철이","990101",28,"2222","서울");
      e[2] = new 과제2("똘이","990101",28,"2222","인천");
      e[3] = new 과제2("박이","990101",28,"2222","인천");
      e[4] = new 과제2("김이","990101",28,"2222","인천");
      e[5] = ez; //위에 있는 값 넣기 
      e[6] = ez2; //위에 있는 값 넣기
      
      e[0].insertCourse("DB", "1개월");
      e[1].insertCourse("html", "1개월");
      e[1].insertCourse("java", "1개월");
      
      
      	/* 학생 이름으로 검색 => 모든정보 출력
		 * 지점 정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색
		 */
      
      String name = "영이";
      String branch = "서울";
      String course = "DB";

      
      for(int i=0; i<e.length; i++) {
    	 if(e[i].getName().equals(name)) {
    		 e[i].printInfo();
    		 e[i].printCompany();
    		 e[i].printCourse();
    	 }
    	 if(e[i].getBranch().equals(branch)) {
    		 e[i].printInfo();
    	 }
      }
      
      for(int i=0; i<e.length; i++) {
    	  for(int j=0; j<e[i].getCnt(); j++) {
    		  if(e[i].getCourse()[j].equals(course)) {
    			  e[i].printInfo();
    		  }
    	  }
      }
   }
}