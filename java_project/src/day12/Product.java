package day12;

import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	private String menu;
	private String price;
	
	
	
	Product(){}
	Product(String menu, String price){
		this.menu = menu;
		this.price = price;
	}
	
	
	
	
	public void print() {
			System.out.println(menu+" : "+price);
	}
	
	
	
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
