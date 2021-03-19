package ExceptionEx;
import java.io.IOException;
import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) throws IOException {

		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		result = 100/num;
		
		System.out.println(result);
		sc.close();
		
		throw new IOException();


	}

}
