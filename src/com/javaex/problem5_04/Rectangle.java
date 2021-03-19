package com.javaex.problem5_04;

public class Rectangle extends Shape implements Resizeable {
	double height;
	double width;

	public Rectangle(double height, double width) {
		super(4);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		double temp = this.height * this.width;
		return temp;
	}

	@Override
	public double getPerimeter() {
		double temp = (this.height + this.width) * 2;
		return temp;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;

	}

}
