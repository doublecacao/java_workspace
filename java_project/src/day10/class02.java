package day10;

import java.util.Scanner;

public class class02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자동차 클래스 생성
		 * 멤버변수 : 차종, 연식, 색, 속도, 전원
		 * 메서드 : 전원on, 전원off, 스피드 up, 스피드 down
		 */
		
//		Car c1 = new Car();
//		c1.setNumber("11부7863");
//		c1.setYears(2016);
//		c1.print();
//		
//		while(c1.power()==true) {
//			
//		}
		
		Car c1 = new Car("터보 1.4 ltz","2016","쥐색");
		c1.powerOn();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.powerOff();
	}
}

class Car{
	//멤버변수 선언
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	//생성자
	public Car() {}
	public Car(String name, String year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	
	
	//메서드
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		if(speed==0) {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		}else {
			System.out.println("속도를 0으로 줄여주세요.");
		}
	}
	public void speedUp() {
		if(power) {
			speed=speed+10;
			System.out.println("현재속도 "+speed);
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}
	public void speedDown() {
		if(speed==0&&power) {
			System.out.println("더이상 속도를 줄일 수 없습니다.");
		}else {
			speed=speed-10;
			System.out.println("현재속도 "+speed);
		}
	}
	
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
//	private int speed;
//	private String number;
//	private int years;
//	private boolean power;
//	
//	public void print() {
//		System.out.println("차량번호: "+number+" 연식: "+years);
//	}
//	
//	public boolean power() {
//		char onoff;
//		
//		System.out.print("전원을 켜시겠습니까?(y/n)> ");
//		Scanner sc = new Scanner(System.in);
//		onoff = sc.next().charAt(0);
//		
//		if(onoff=='y') {
//			return true;
//		}
//		else if(onoff=='n') {
//			return false;
//		}
//		else
//			return false;
//	}
//	
//	
//	public int speedUp(String up) {
//		if(up.equals("+")) {
//			speed++;
//		}
//		return speed;
//	}
//	public int speedDown(String down) {
//		if(down.equals("-")) {
//			speed--;
//		}
//		return speed;
//	}
//	
//	
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	public String getNumber() {
//		return number;
//	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
//	
//	public int getYears() {
//		return years;
//	}
//	public void setYears(int years) {
//		this.years = years;
//	}
//	
//	public boolean isPower() {
//		return power;
//	}
//	public void setPower(boolean power) {
//		this.power = power;
//	}
}