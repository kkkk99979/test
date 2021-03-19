package bookshop;

public class BookInfoVO {
	private Long bookId;
	private String title;
	private String pubs;
	private String pubsDate;
	private String authorName;
	
	public BookInfoVO(Long bookId, String title, String pubs, String pubsDate, String authorName) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.pubs = pubs;
		this.pubsDate = pubsDate;
		this.authorName = authorName;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubs() {
		return pubs;
	}
	public void setPubs(String pubs) {
		this.pubs = pubs;
	}
	public String getPubsDate() {
		return pubsDate;
	}
	public void setPubsDate(String pubsDate) {
		this.pubsDate = pubsDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	@Override
	public String toString() {
		return "BookInfoVO [bookId=" + bookId + ", title=" + title + ", pubs=" + pubs + ", pubsDate=" + pubsDate
				+ ", authorName=" + authorName + "]";
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
