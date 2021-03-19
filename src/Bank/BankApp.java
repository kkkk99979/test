package Bank;

import java.io.IOException;

public class BankApp {

	public static void main(String[] args) throws IOException {
		Bank account = new Bank();
		boolean run = true;
		
		account.readFile();
		
		while (run) {
			int num = account.showMenu();
			switch (num) {
			case 1: {
				account.In();
				break;
			}
			case 2: {
				account.out();
				break;
			}
			case 3: {
				account.showMoney();
				break;
			}
			case 4: {
				account.showBefore();
				break;
			}
			case 5: {
				System.out.println("종료합니다.");
				run = false;
				break;
			}
			default: {
				System.out.println("다시 입력하세요.");
			}
			}
		}
	}
}
