
public class point {
	public int x;
	public int y;

	public void setx(int x) {
		this.x = x;

	}

	public int getx() {
		return x;

	}

	public void sety(int y) {
		this.y = y;

	}

	public int gety() {
		return y;
	}

	public void display() {
		System.out.println("Point is " + "(" + getx() + "," + gety() + ")");
	}
}
