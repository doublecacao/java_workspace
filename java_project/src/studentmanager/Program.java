package studentmanager;

import java.util.Scanner;

public interface Program {
/*1. 인터페이스
	-학생 리스트 출력 메서드
	-학생 추가 메서드
	-학생 검색 메서드
	-학생 수강신청 메서드
	-학생 수강철회 메서드
 */
	
	void printStudent();	//학생 전체 리스트 출력
	void insertStudent(Scanner scan);	//스캐너로 메서드내부에서 입력받기
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
}
