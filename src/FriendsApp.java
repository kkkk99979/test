import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Friends[] s = new Friends[3];
		String name;
		System.out.println("ģ�� 3���� ����� �ּ���");
		for (int i = 0; i < s.length; i++) {
			name = sc.nextLine();
			String[] a = name.split(" ");
			while (s.length !=a.length) {
				System.out.println("���Ŀ� ���缭 �ٽ��Է��ϼ���.");
				name = sc.nextLine();
				 a = name.split(" ");
			}
			s[i] = new Friends(a[0],a[1],a[2]);
		}
		for (int i = 0; i < s.length; i++) {
			s[i].show();
		}
		
		sc.close();
	}

}
