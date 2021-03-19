package banks;

public class banksVO {
	private Long seq_id;
	private int ins;
	private int outs;
	private String dates;
	private int bal;
	
	public banksVO() {
		super();
	}

	public banksVO(Long seq_id, int ins, int outs, String dates, int bal) {
		super();
		this.seq_id = seq_id;
		this.ins = ins;
		this.outs = outs;
		this.dates = dates;
		this.bal = bal;
	}

	public banksVO(int int1, int int2, String string, int int3) {
		this.ins = int1;
		this.outs = int2;
		this.dates = string;
		this.bal = int3;
	}

	public Long getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(Long seq_id) {
		this.seq_id = seq_id;
	}
	public int getIns() {
		return ins;
	}
	public void setIns(int ins) {
		this.ins = ins;
	}
	public int getOuts() {
		return outs;
	}
	public void setOuts(int outs) {
		this.outs = outs;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "입금액:" + getIns() + "\s\s\t출금액:" + getOuts() + "\s\s\t거래날짜:" + getDates() + "\s\s\t잔액:" + getBal();
	}
	
	
}
