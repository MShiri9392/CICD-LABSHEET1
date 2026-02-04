import java.util.Scanner;

public class EVENODD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int number = scanner.nextInt();
        
        if (number == 0) {
            System.out.println("The given number is Zero");
        } else if (number % 2 == 0) {
            System.out.println("The given number " + number + " is Even");
        } else {
            System.out.println("The given number " + number + " is Odd");
        } }else{
            System.out.println("The given number" + number + "is negative")
        }

        
        scanner.close(); 
    }
}

