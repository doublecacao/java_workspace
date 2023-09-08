package lottomanager;

import java.util.Scanner;

public interface LottoProgram {
	
	void createLotto(Scanner scan);	//수동 로또 번호 입력
	void createLottoAuto();
	void insertLottoAuto();	//당첨번호
	void checkLotto();
	void printLotto();
}
