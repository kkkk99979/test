package javaEx.ch2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape[] sArray = new Shape[3];
//
//		Shape s01 = new Circle(10);
//		Shape s02 = new Triangle(5, 5);
//		Shape s03 = new Rectangle(7, 7);
//
//		sArray[0] = s01;
//		sArray[1] = s02;
//		sArray[2] = s03;
//
//		for (int i = 0; i < sArray.length; i++) {
//			System.out.println(sArray[i].area());
//		}
//
//		for (int i = 0; i < sArray.length; i++) {
////  		  if(sArray[i] instanceof Triangle ) {
//          System.out.println("삼각형의 면적은 " + sArray[i].area());
//        }
//  		  if(sArray[i] instanceof Circle ) {
//          System.out.println("원의 면적은 " + sArray[i].area());
//        }
//  		  if(sArray[i] instanceof Rectangle ) {
//          System.out.println("사각형의 면적은 " + sArray[i].area());
//        }
//	}

//	Shape[] sArray = new Shape[3];
//
//	Shape s01 = new Rectangle("빨강", "빨강", 7, 7);
//	Shape s02 = new Triangle("초록", "초록", 5, 5);
//	Shape s03 = new Circle("노랑", "노랑", 10);
//
//	sArray[0]=s01;sArray[1]=s02;sArray[2]=s03;
//
//	for(
//	int i = 0;i<sArray.length;i++)
//	{
//		sArray[i].draw();
//	}
//
//	for(
//	int i = 0;i<sArray.length;i++)
//	{
//		if (sArray[i] instanceof Triangle) {
//			System.out.println(sArray[i].area());
//		}
//	}

	Shape c = new Circle(8);
	Shape r = new Rectangle(5, 6);
	Shape t = new Triangle(5, 6);

	System.out.println("Circle area: "+c.area());
	System.out.println("Rectangle area: "+r.area());
	System.out.println("Triangle area: "+t.area());

	// 객체가 Circle 클래스의 객체 인가?
	System.out.println(c instanceof Circle);

	// 객체가 Drawable 인터페이스를 구현하였는가?
	System.out.println(c instanceof Drawable);

	// 객체가 Rectangle 클래스의 인스턴스 인가?
	System.out.println(r instanceof Rectangle);

	// 객체가 Shape 클래스의 인스턴스 인가?
	System.out.println(r instanceof Shape);

	System.out.println(r instanceof Drawable);

}
}
