package day09;

public class classex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.print();
		p.setx(1);
		p.sety(3);
		p.print();
		System.out.println(p.getx());
		System.out.println(p.gety());
		
		p.setx(10);
		p.print();
		
		Point1 pl = new Point1();
		pl.print();
		pl.setX(1);
		pl.setY(2);
		pl.setZ(3);
		
		System.out.println(pl.getX());
		System.out.println(pl.getY());
		System.out.println(pl.getZ());
		pl.print();
	}

}

//(0,0)
class Point{
	//멤버볌ㄴ수 자리
	int x;
	int y;
	//print
	//같은 클래스의 멤버변수는 모든 메서드에서 공유된다.
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	//getter(멤버변수의 값을 가져오는 역할의 메서드)
	//setter(멤버변수의 값을 변경하는 역할의 메서드)
	public int getx() {
		//this 내 클래스의 멤버변수를 지칭하는 키워드
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public void setx(int x) {	//매개변수 x와 멤버변수 x는 다름
		this.x = x;
	}
	
	public void sety(int y) {	
		this.y = y;
	}
}

class Point1{
	private int x;
	private int y;
	private int z;
	
	public void print() {
		System.out.println("("+x+","+y+","+z+")");	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
//	public int getX() {
//		return x;
//	}
//	public int getY() {
//		return y;
//	}
//	public int getZ() {
//		return z;
//	}
//	
//	public void setX(int x) {
//		this.x = x;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public void setZ(int z) {
//		this.z = z;
//	}
	
	
}