package btvn.document;

public class Book extends Document {
	private String author;
	private long page;

	public Book(String author, long page) {
		super();
		this.author = author;
		this.page = page;
	}

	public Book(int code, String nxb, long quantity, String author, long page) {
		super(code, nxb, quantity);
		this.author = author;
		this.page = page;
	}

	public Book(String nxb, long quantity, String author, long page) {
		super(nxb, quantity);
		this.author = author;
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", page=" + page + ", toString()=" + super.toString() + "]";
	}

}
