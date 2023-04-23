import java.util.Scanner;
public class sumofevenodd {
	
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Sum of odd and even numbers");
		int num1;
		System.out.println("enter number");
		num1 = sc.nextInt();
		int totalevens=0, totalodds=0;
		
		if(num1%2==0) {
			totalevens = num1/2;
			totalodds = num1/2;
		}
		else
		{
			totalevens = num1/2;
			totalodds = totalevens+1;
		}
			

float o = totalodds;
float e = totalevens;

		
		float sumofeven=((2 + (e-1)*2)*e)/2;
		float sumofodd=((2 + (o-1)*2)*o)/2;
		System.out.println("sum of evens is "+sumofeven+" sum of odds"+sumofodd);
		

		}

	

}
