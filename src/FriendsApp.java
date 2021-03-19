import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Friends[] s = new Friends[3];
		String name;
		System.out.println("친구 3명을 등록해 주세요");
		for (int i = 0; i < s.length; i++) {
			name = sc.nextLine();
			String[] a = name.split(" ");
			while (s.length !=a.length) {
				System.out.println("형식에 맞춰서 다시입력하세요.");
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
