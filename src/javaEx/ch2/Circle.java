package javaEx.ch2;

public class Circle extends Shape implements Drawable{

	private int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return radius * radius * 3.14;
	}

  @Override
  public void draw() {
    // TODO Auto-generated method stub
    System.out.println("반지름이 " + radius + "인 원을 그렸습니다.");
  }

}
