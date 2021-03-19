package banks;

import java.util.List;


public interface banksDAO {
	public int gets();
	public List<banksVO> getList();
	public void deposit(int i);
	public void withdraw(int i);
	public void search(String date);
	public void search(String date,String date2);
}
