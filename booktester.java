import java.util.Scanner;

public class booktester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.println("Enter Book Name");
		b1.setbname(sc.next());
		System.out.println("Enter Id");
		b1.setid(sc.nextInt());
		System.out.println("Enter Author");
		b1.setauthor(sc.next());
		System.out.println("Enter Price");
		b1.setprice(sc.nextInt());

		System.out.println("Enter Name");
		b2.setbname(sc.next());
		System.out.println("Enter Id");
		b2.setid(sc.nextInt());
		System.out.println("Enter Author");
		b2.setauthor(sc.next());
		System.out.println("Enter Price");
		b2.setprice(sc.nextInt());

		

		b1.display();
		b2.display();

	}

}
