
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
    	System.out.printf("�ԱݵǾ����ϴ�.\n�ܾ�: %d\n",getBalance());
    }
    public void withdraw(int a) {
    	if (getBalance() < a) {
    		System.out.printf("�ܾ��� �����մϴ�.\n�ܾ�: %d\n",getBalance());
    	} else {
    	this.balance -= a;
    	System.out.println("��ݵǾ����ϴ�.");
    	System.out.printf("�ܾ�: %d\n",getBalance());
    	}
    }
    public void showBalance() {
    	System.out.println(getBalance());
    }

}
