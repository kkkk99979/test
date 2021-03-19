
public class Bank {
    private String accountNo;
    private int balance;
    
	public Bank(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
    public void deposit(int a) {
    	this.balance += a;
    	System.out.printf("입금되었습니다.\n잔액: %d\n",getBalance());
    }
    public void withdraw(int a) {
    	if (getBalance() < a) {
    		System.out.printf("잔액이 부족합니다.\n잔액: %d\n",getBalance());
    	} else {
    	this.balance -= a;
    	System.out.println("출금되었습니다.");
    	System.out.printf("잔액: %d\n",getBalance());
    	}
    }
    public void showBalance() {
    	System.out.println(getBalance());
    }

}
