import java.util.Scanner;

public class pointtester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		point pnt1 = new point();

		System.out.println("pointer");
		System.out.println("Enter points x and y");

		pnt1.setx(sc.nextInt());
		pnt1.sety(sc.nextInt());

		pnt1.display();

	}

}
