package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) throws IOException {
		String fileLine = null;
		boolean run = true;
		BufferedWriter fout = null;
		Scanner sc = new Scanner(System.in);
		Test account = new Test();
		System.out.print("계좌를 입력하세요>> ");
		account.setAccount(sc.next());
		File f = new File("C:/Users/1강의실/Desktop/eclipse/account/" + account.getAccount() + ".txt");
		if (f.exists() == false) {
			System.out.println("없는 계좌입니다. 계좌를 새로 생성합니다.");
			System.out.print("이름을 입력하세요>> ");
			account.setName(sc.next());
			System.out.print("연락처를 입력하세요>> ");
			account.setNum(sc.next());
			System.out.println("생성되었습니다. 계좌정보를 불러옵니다.");
			fout = new BufferedWriter(new FileWriter(f, true));
			fout.append(account.showInfo());
		} else {
			System.out.println("계좌정보를 불러옵니다.");
		}
		FileReader filereader;
		filereader = new FileReader(f);
		// 입력 버퍼 생성
		BufferedReader bufReader = new BufferedReader(filereader);
		String contents = "";
		while ((contents = bufReader.readLine()) != null) {
			String[] s = contents.split(",");
			fileLine = s[(s.length) - 1];
		}
		try {
			int temp = Integer.parseInt(fileLine);
			account.setSum(temp);
		} catch (Exception e) {
			account.setSum(0);
		}
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.거래내역조회 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("매뉴선택>> ");
			int temp = sc.nextInt();
			switch (temp) {
			case 1: {
				System.out.println("예금할 금액을 입력하세요.");
				int in = sc.nextInt();
				account.In(in);
				fout.append(account.inFo());
				account.setInput(0);
				break;
			}
			case 2: {
				System.out.println("출금할 금액을 입력하세요.");
				int out = sc.nextInt();
				account.out(out);
				fout.append(account.inFo());
				account.setOutput(0);
				break;
			}
			case 3: {
				System.out.println("잔액:" + account.getSum());
				break;
			}
			case 4: {
				while ((contents = bufReader.readLine()) != null) {
					System.out.println(contents);
			}
				break;
			}
			case 5: {
				System.out.println("종료합니다.");
				run = false;
				break;
			}
			}
		}
		bufReader.close();
		fout.close();
		sc.close();
	}
}
