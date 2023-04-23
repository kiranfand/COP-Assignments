import java.util.Scanner;
public class sumofseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of Series");
	float num1;
	System.out.println("enter number");
	num1 = sc.nextInt();
	float sum=((num1+1)/2)*num1;
	System.out.println("sum of series is "+sum);
	

	}

}
