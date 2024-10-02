import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double num1 = 0;
        double num2 = 0;

        System.out.println("Enter your first number.");
        if (scan.hasNextDouble()) {
            num1 = scan.nextDouble();
        } else {
            System.out.println("You have entered the wrong data type.");
        }

        System.out.println("Enter your second number.");
        if (scan.hasNextDouble()) {
            num2 = scan.nextDouble();
        } else {
            System.out.println("You have entered the wrong data type.");
        }

        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The two numbers are equal to each other.");
        }
    }
}