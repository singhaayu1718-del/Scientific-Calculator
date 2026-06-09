import java.util.Scanner;

class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    int sub(int a, int b) {
        return a - b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    // Multiplication
    int mul(int a, int b) {
        return a * b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    // Division with Exception Handling
    double div(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
    }

    // Scientific Functions
    double sqrt(double a) {
        return Math.sqrt(a);
    }

    double power(double a, double b) {
        return Math.pow(a, b);
    }

    double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }
}

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;

        do {

            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    double a1 = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    System.out.println("Result = " + calc.add(a1, b1));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    double a2 = sc.nextDouble();
                    double b2 = sc.nextDouble();
                    System.out.println("Result = " + calc.sub(a2, b2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    double a3 = sc.nextDouble();
                    double b3 = sc.nextDouble();
                    System.out.println("Result = " + calc.mul(a3, b3));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    double a4 = sc.nextDouble();
                    double b4 = sc.nextDouble();
                    System.out.println("Result = " + calc.div(a4, b4));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Square Root = " + calc.sqrt(n1));
                    break;

                case 6:
                    System.out.print("Enter base and power: ");
                    double base = sc.nextDouble();
                    double power = sc.nextDouble();
                    System.out.println("Result = " + calc.power(base, power));
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    double angle1 = sc.nextDouble();
                    System.out.println("Sin = " + calc.sin(angle1));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    double angle2 = sc.nextDouble();
                    System.out.println("Cos = " + calc.cos(angle2));
                    break;

                case 9:
                    System.out.println("Calculator Closed");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
