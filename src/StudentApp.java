import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Student[] Arr = new Student[2];
	
	
	for (int i=0;i<Arr.length;i++) {
		System.out.printf("%d��°�л� �̸�:",i+1);
		String a = sc.next();
		System.out.print("�й� : ");
		String b =  sc.next();
		System.out.print("���� :");
		String c = sc.next();
		System.out.print("����: ");
		double d = sc.nextDouble();
		Arr[i]= new Student(a,b,c,d);
	}
	for (int i=0;i<Arr.length;i++) {
		Arr[i].showInfo();
	}
	sc.close();
	}

}
