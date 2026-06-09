import java.util.Scanner;

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double mul(double a, double b) {
        return a * b;
    }

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
}

public class ScientificCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;

        do {
            System.out.println("\n1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println("Result = " + calc.add(a, b));
                        break;

                    case 2:
                        System.out.println("Result = " + calc.sub(a, b));
                        break;

                    case 3:
                        System.out.println("Result = " + calc.mul(a, b));
                        break;

                    case 4:
                        System.out.println("Result = " + calc.div(a, b));
                        break;
                }
            }

        } while (choice != 5);

        System.out.println("Calculator Closed");
        sc.close();
    }
}
