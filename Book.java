
public class Book {

	private String bname;
	private int id;
	private int price;
	private String author;

	public void setbname(String n) {
		bname = n;
	}

	public void setauthor(String c) {
		author = c;
	}

	public void setid(int a) {
		id = a;
	}

	public void setprice(int a) {
		price = a;
	}

	public String getbname() {
		return bname;
	}

	public String getauthor() {
		return author;
	}

	public int getprice() {
		return price;
	}

	public int getid() {
		return id;
	}

	public void display() {

		System.out.println("Book Name:" + bname + " id:" + id + " author:" + author + " price" + price);
	}

}
