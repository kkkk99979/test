package banks;

import java.util.List;
import java.util.Scanner;

public class banksApp {

	public static void main(String[] args) {
		banksDAOImpl temp = new banksDAOImpl();
		banksVO temp2 = new banksVO();
		temp2.setBal(temp.gets());
		boolean run = true;

		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.print("(1.입금, 2.출금, 3.잔액, 4.거래일조회, 5.기간별조회, 6.종료) " + "\n" + ">>");
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.print("입금할 금액 입력>>");
				try {
					int temp3 = sc.nextInt();
					temp.deposit(temp3);
					break;
				} catch (Exception e) {
					System.out.println("애러");
					break;
				}
			}
			case 2: {
				System.out.print("출금할 금액 입력>>");
				try {
					int temp3 = sc.nextInt();
					temp.withdraw(temp3);
					break;
				} catch (Exception e) {
					System.out.println("애러");
					break;
				}
			}
			case 3: {
				System.out.println("잔액>>" + temp.gets());
				break;
			}
			case 4: {
				System.out.print("날짜를 입력하세요.(형식: YYMMDD)\n>>");
				String temp3 = sc.next();
				temp.search(temp3);
				break;
			}
			case 5: {
				System.out.print("첫번째 날짜(형식: YYMMDD)\n>>");
				String tem = sc.next();
				System.out.print("두번째 날짜(형식: YYMMDD)\n>>");
				String te = sc.next();
				temp.search(tem, te);
				break;
			}
			case 6: {
				System.out.println("종료");
				run = false;
				sc.close();
				break;
			}
			}
		}
	}
}
