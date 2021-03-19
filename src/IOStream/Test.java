package IOStream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
	Date time = new Date();
	String today = now.format(time);
	
	private String account;
	private String name;
	private String num;
	private String date;
	private int input;
	private int output;
	private int sum;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void In(int i) {
		this.input = i;
		this.sum += this.input;
		System.out.println("입금완료.");
	}
	public void out (int i) {
		this.output = i;
		this.sum -= this.output;	
		System.out.println("출금완료.");
	}
	public void rest() {
		System.out.printf("현재잔액: %d\n",this.sum);
	}
	public String time() {
		return today;
	}
	public String showInfo() {
		return "계좌:"+this.getAccount()+"\t\t이름:"+this.getName()+"\t연락처:"+this.getNum()+"\n거래날짜\t\t예금액\t출금액\t잔액\t\n";
	}
	public String inFo() { 
			return	(today+"\t\t"+this.input+"\t"+this.output+"\t"+this.sum+"\n");
	}
		
		
		
	}


