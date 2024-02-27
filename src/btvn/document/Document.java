package btvn.document;

public class Document {
	private static int INDEX = 0;
	private int code;
	private String nxb;
	private long quantity;

	public Document() {
	}

	public Document(int code, String nxb, long quantity) {
		this.code = code;
		this.nxb = nxb;
		this.quantity = quantity;
	}

	public Document(String nxb, long quantity) {
		this.code = ++INDEX;
		this.nxb = nxb;
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Document [code=" + code + ", nxb=" + nxb + ", quantity=" + quantity + "]";
	}
}
