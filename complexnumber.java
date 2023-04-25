
public class complexnumber {

	public int real;
	public int imaginary;

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void display() {
		System.out.println("Complex number is " + getReal() + "+" +"i"+ getImaginary());
	}

}
