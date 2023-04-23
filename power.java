import java.util.Scanner;
public class power {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	System.out.println("power");
int num1,pow,newnum=1;
System.out.println("enter number");
num1 = sc.nextInt();
System.out.println("enter power");
pow = sc.nextInt();

for (int i =1; i<=pow; i++ )
	newnum = newnum * num1;
System.out.println("power is "+newnum );
}
}
