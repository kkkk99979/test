
public class ShapeApp {

	public static void main(String[] args) {

		Circle a = new Circle(8);
		System.out.printf("�������� %d �� ���� ������ %.2f �̴�.\n", a.getRadius(), a.area());
		Triangle b = new Triangle();
		b.setX(3);
		b.setY(5);
		System.out.printf("���ΰ� %.1f ���ΰ� %.1f �� �ﰢ���� ���̴� %.1f �̴�.\n", b.getX(), b.getY(), b.area());
		Rectangle c = new Rectangle(5, 3);
		System.out.printf("���ΰ� %d ���ΰ� %d�� ���簢���� ���̴� %.0f�̴�.\n", c.getX(), c.getY(), c.area());

		Shape d = new Circle();
		System.out.println(d instanceof Circle);
		System.out.println(d instanceof Drawable);
		System.out.println(d instanceof Rectangle);
		System.out.println(d instanceof Shape);

	}

}
