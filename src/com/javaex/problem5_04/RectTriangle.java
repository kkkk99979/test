package com.javaex.problem5_04;

public class RectTriangle extends Shape {

	double width;
	double height;

	public RectTriangle(int height, int width) {
		super(3);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		double temp = this.height + this.width + (Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2))));
		return temp;
	}

	@Override
	public double getArea() {
		double temp = this.height * this.width * 0.5;
		return temp;
	}

}
