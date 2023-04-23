import java.util.Scanner;
public class PrimeNumber {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	System.out.println("PrimeNumber");
int num1;
System.out.println("enter number");
num1 = sc.nextInt();
int factors=0;
for(int i=1;i<=num1;i++) {
	if (num1%i==0)
		factors++;
}

if (factors <=2)
	System.out.println("Prime Number");
else
	System.out.println("Not a Prime Number");
		



}
}
