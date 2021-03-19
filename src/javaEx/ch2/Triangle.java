package javaEx.ch2;

public class Triangle extends Shape{

	protected int width;
	protected int height;
	
	public Triangle() {}

	public Triangle( int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(
				 " 가로=" + width + " 세로=" + height + " 삼각형을 그렸습니다.");
	}

	public double area() {
		return (double)width * height / 2;
	}
	

}
