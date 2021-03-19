package Bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
	Date time = new Date();
	private String name;
	private String acc;
	private String tel;
	private String date = now.format(time);
	private int in;
	private int out;
	private int sum;
	BufferedWriter fout = null;
	String money = null;
	BufferedReader br;
	File f;

	public String getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public void readFile() throws IOException {
		System.out.print("계좌번호를 입력하세요>> ");
		this.setAcc(sc.nextLine());
		f = new File("C:/Users/1강의실/Desktop/eclipse/account/" + this.getAcc() + ".txt");
		if (f.exists()) {
			br = new BufferedReader(new FileReader(f));
			String temp;
			while ((temp = br.readLine()) != null) {
				String[] s = temp.split("\t");
				money = s[(s.length) - 1];
			}
			try {
				this.setSum(Integer.parseInt(money));
			} catch (Exception e) {
				this.setSum(0);
			}
			System.out.println("계좌정보를 불러옵니다.");
			br.close();
			fout = new BufferedWriter(new FileWriter(f, true));
		} else {
			fout = new BufferedWriter(new FileWriter(f, true));
			System.out.println("없는 계좌입니다. 계좌를 생성합니다.");
			System.out.print("이름>> ");
			this.setName(sc.nextLine());
			System.out.print("연락처>> ");
			this.setTel(sc.nextLine());
			fout.append(this.showInfo());
			System.out.println("계좌가 생성되었습니다.");
			fout.flush();
		}
	}
	
	public void In() throws IOException {
		System.out.print("입금할 액수를 입력하세요>> ");
		this.in = sc.nextInt();
		setSum(getSum() + this.in);
		fout.append(this.Info());
		this.setIn(0);
		System.out.println("입금완료.");
		fout.flush();
	}

	public void out() throws IOException {
		System.out.print("출금할 액수를 입력하세요>> ");
		int temp = sc.nextInt();
		if (temp > this.getSum()) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.setOut(temp);
			this.setSum(this.getSum() - this.getOut());
			fout.append(this.Info());
			System.out.println("출금완료.");
			this.setOut(0);
			fout.flush();
		}
	}

	public String showInfo() {
		return "계좌:" + this.getAcc() + "\t이름:" + this.getName() + "\t연락처:" + this.getTel() + "\n거래날짜\t\t입금액\t출금액\t잔액\n";
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String Info() {
		return this.getDate() + "\t" + this.getIn() + "\t" + this.getOut() + "\t" + this.getSum() + "\n";
	}

	public int showMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.입금 | 2.출금 | 3.잔액 | 4. 거래내역조회 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("메뉴선택>> ");
		return sc.nextInt();
	}

	public void showMoney() {
		System.out.printf("잔액: %d\n", this.getSum());
	}

	public void showBefore() throws IOException {
		br = new BufferedReader(new FileReader(f));
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
	}
}
