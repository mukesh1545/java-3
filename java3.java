import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            System.out.println("Scientific Calculator\n");
            System.out.println("Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Sin");
            System.out.println("6. Cos");
            System.out.println("7. Tan");
            System.out.println("8. Log");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Thank you for using the calculator. Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to add: ");
                    result += scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Enter the number to subtract: ");
                    result -= scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Enter the number to multiply: ");
                    result *= scanner.nextDouble();
                    break;
                case 4:
                    System.out.print("Enter the number to divide: ");
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        result /= divisor;
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the angle in degrees for sin: ");
                    double degrees = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(degrees));
                    break;
                case 6:
                    System.out.print("Enter the angle in degrees for cos: ");
                    degrees = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(degrees));
                    break;
                case 7:
                    System.out.print("Enter the angle in degrees for tan: ");
                    degrees = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(degrees));
                    break;
                case 8:
                    System.out.print("Enter the number for log: ");
                    double num = scanner.nextDouble();
                    if (num > 0) {
                        result = Math.log(num);
                    } else {
                        System.out.println("Invalid input. Logarithm is defined for positive numbers only.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println("Result: " + result + "\n");
        }

        scanner.close();
    }
}
