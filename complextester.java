import java.util.Scanner;

public class complextester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		complexnumber cmp1 = new complexnumber();

		System.out.println("Complex Number");
		System.out.println("Enter real and imaginary numbers");

		cmp1.setReal(sc.nextInt());
		cmp1.setImaginary(sc.nextInt());
		
		cmp1.display();
	}

}
