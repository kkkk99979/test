package com.javaex.problem5_03;

public class Goods {
	private String name;
	private int price;
	private int num;
	
	public Goods() {
		super();
	}
	public Goods(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void showInfo() {
		System.out.printf("%s(가격:%d)이 %d개 입고되었습니다.\n",this.getName(),this.getPrice(),this.getNum());
	}
	
}
