package com.javaex.problem5_04;

public abstract class Shape {
	int countsides;

	public Shape(int countsides) {
		this.countsides = countsides;
	}
	public int getCountsides() {
		return countsides;
	}
	public abstract double getArea();
	public abstract double getPerimeter();

		
	}
	
	
	


