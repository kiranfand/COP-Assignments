import java.util.Scanner;
public class swapnumbers {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	System.out.println("Swapping of two numbers");
int num1, num2;
System.out.println("enter number 1");
num1 = sc.nextInt();
System.out.println("enter number 2");
num2 = sc.nextInt();

num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

System.out.println("After swapping number1 is "+num1+" and number2 is "+num2);
}
}
