import java.util.Scanner;

class Calculator {
    double add(double a, double b) { return a + b; }
    double sub(double a, double b) { return a - b; }
    double mul(double a, double b) { return a * b; }

    double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;

        do {
            System.out.println("\n1.Add 2.Sub 3.Mul 4.Div 5.Exit");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                switch (choice) {
                    case 1: System.out.println(calc.add(a,b)); break;
                    case 2: System.out.println(calc.sub(a,b)); break;
                    case 3: System.out.println(calc.mul(a,b)); break;
                    case 4: System.out.println(calc.div(a,b)); break;
                }
            }
        } while (choice != 5);

        sc.close();
    }
}