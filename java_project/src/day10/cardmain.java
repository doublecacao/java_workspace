package day10;

public class cardmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cardpack cp = new cardpack();
		int j=0;
		cp.CardShuffle();
		for(int i=0; i<cp.getPack().length; i++) {			
			j++;
			cp.getPack()[i].print();
			System.out.print(" ");
			if(j%13==0) {
				System.out.println();
			}
		}
		Card tmp = cp.CardPick();
		tmp.print();
		System.out.println();
		cp.CardReset();
		cp.CardPick().print();
	}
}
