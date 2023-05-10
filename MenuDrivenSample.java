import java.util.Scanner;

public class MenuDrivenSample {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Print Hello World");
            System.out.println("2. Print a pattern");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Hello World!");
                    break;
                case 2:
                    System.out.println("Enter the number of rows: ");
                    int rows = scanner.nextInt();
                    for(int i = 1; i <= rows; i++) {
                        for(int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 3);
        
        scanner.close();
    }
    
}
