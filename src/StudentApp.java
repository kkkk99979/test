import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Student[] Arr = new Student[2];
	
	
	for (int i=0;i<Arr.length;i++) {
		System.out.printf("%d번째학생 이름:",i+1);
		String a = sc.next();
		System.out.print("학번 : ");
		String b =  sc.next();
		System.out.print("성별 :");
		String c = sc.next();
		System.out.print("학점: ");
		double d = sc.nextDouble();
		Arr[i]= new Student(a,b,c,d);
	}
	for (int i=0;i<Arr.length;i++) {
		Arr[i].showInfo();
	}
	sc.close();
	}

}
