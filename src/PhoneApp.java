import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		Telephone tel = new Telephone();
		Smartphone gal = new Smartphone();
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		System.out.print("당신의 휴대폰 번호를 입력하세요.");
		String PhoneNum = sc.next();
		System.out.print("유무선 선택(1은 유선,2는 무선): ");
		int type = sc.nextInt();
		switch (type) {
		case 1: {
			tel.power(power);
			tel.setNumber(PhoneNum);
			while (power) {
				System.out.println("---------------------");
				System.out.println("----1.전화 | 2.전원----");
				System.out.println("---------------------");
				int num = sc.nextInt();
				switch (num) {
				case 1: {
					System.out.print("전화걸 번호를 눌러주세요:");
					String number = sc.next();
					tel.call(number);
					break;
				}
				case 2: {
					power = false;
					tel.power(power);
					break;
				}
				}
			}
			break;

		}

		case 2: {
			gal.turnOn(power);
			gal.setNumber(PhoneNum);
			while (power) {
				System.out.println("----------------------");
				System.out.println("1.전화 | 2.인터넷 | 3.전원");
				System.out.println("----------------------");
				int num = sc.nextInt();
				switch (num) {
				case 1: {
					System.out.print("전화걸 번호를 눌러주세요:");
					String number = sc.next();
					gal.call(number);
					break;
				}
				case 2: {
					System.out.print("접속할 주소를 입력하세요.");
					String site = sc.next();
					gal.searchInternet(site);
					break;
				}
				case 3: {
					power = false;
					gal.turnOn(power);
					break;
				}
				}
			}
		}
		}
		sc.close();
	}
}
