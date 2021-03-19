
public class ColorPoint extends Point {

	String color;

	public ColorPoint(String color) {
		super(-1,-1);
		System.out.println("color");
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		System.out.println("color");
		super.setX(x);
		super.setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void showInfo()  {
		System.out.println("color");
		System.out.printf("(%d , %d)에 %s색의 점을 찍었습니다.\n",getX(),getY(),getColor());
	}

}
