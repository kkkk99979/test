
public class ShapeApp {

	public static void main(String[] args) {

		Circle a = new Circle(8);
		System.out.printf("반지름이 %d 인 원의 면적은 %.2f 이다.\n", a.getRadius(), a.area());
		Triangle b = new Triangle();
		b.setX(3);
		b.setY(5);
		System.out.printf("가로가 %.1f 세로가 %.1f 인 삼각형의 넓이는 %.1f 이다.\n", b.getX(), b.getY(), b.area());
		Rectangle c = new Rectangle(5, 3);
		System.out.printf("가로가 %d 세로가 %d인 직사각형의 넓이는 %.0f이다.\n", c.getX(), c.getY(), c.area());

		Shape d = new Circle();
		System.out.println(d instanceof Circle);
		System.out.println(d instanceof Drawable);
		System.out.println(d instanceof Rectangle);
		System.out.println(d instanceof Shape);

	}

}
