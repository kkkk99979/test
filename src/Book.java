
public class Book {
	private int 	bookNo; 
	private String 	title;
	private String 	author;
	private	int 	stateCode;

	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		System.out.printf("%s��(��) �뿩 �Ǿ����ϴ�.\n",this.getTitle());
		this.setStateCode(0);
	}
	public String print() {
		String temp = "";
		if (this.stateCode==1) {
			temp = "�뿩����";
		} else if (this.stateCode==0) {
			temp =  "�뿩��";
		} return temp;
		
	}

}
