
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
		return getRadius() * getRadius() * 3.14;
	}

	@Override
	public void draw() {
		System.out.println("");
		
	}

}
