import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		Telephone tel = new Telephone();
		Smartphone gal = new Smartphone();
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		System.out.print("����� �޴��� ��ȣ�� �Է��ϼ���.");
		String PhoneNum = sc.next();
		System.out.print("������ ����(1�� ����,2�� ����): ");
		int type = sc.nextInt();
		switch (type) {
		case 1: {
			tel.power(power);
			tel.setNumber(PhoneNum);
			while (power) {
				System.out.println("---------------------");
				System.out.println("----1.��ȭ | 2.����----");
				System.out.println("---------------------");
				int num = sc.nextInt();
				switch (num) {
				case 1: {
					System.out.print("��ȭ�� ��ȣ�� �����ּ���:");
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
				System.out.println("1.��ȭ | 2.���ͳ� | 3.����");
				System.out.println("----------------------");
				int num = sc.nextInt();
				switch (num) {
				case 1: {
					System.out.print("��ȭ�� ��ȣ�� �����ּ���:");
					String number = sc.next();
					gal.call(number);
					break;
				}
				case 2: {
					System.out.print("������ �ּҸ� �Է��ϼ���.");
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
