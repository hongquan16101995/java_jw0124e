package btvn.document;

public class Newpaper extends Document {
	private String date;

	public Newpaper(String date) {
		super();
		this.date = date;
	}

	public Newpaper(int code, String nxb, long quantity, String date) {
		super(code, nxb, quantity);
		this.date = date;
	}

	public Newpaper(String nxb, long quantity, String date) {
		super(nxb, quantity);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Newpaper [date=" + date + ", toString()=" + super.toString() + "]";
	}
}
