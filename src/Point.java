
public class Point {
	int x;
	int y;
	
	public Point() {
		System.out.println("point");
	}
	public Point(int x, int y) {
		System.out.println("point");
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void showInfo() {
		System.out.println("point");
		System.out.printf("(%d , %d)�� ���� ������ϴ�.\n",getX(),getY());
	}
	
	
}
