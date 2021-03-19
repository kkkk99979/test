
public class Triangle extends Shape {

	private double x, y;

	public Triangle() {
		super();
	}

	public Triangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double area() {
		return getX() * getY() / 2;
	}

}
