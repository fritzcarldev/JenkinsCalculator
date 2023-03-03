import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String command = scanner.next();

        switch (command) {
            case "add":
                int sum = calculator.add(scanner.nextInt(), scanner.nextInt());
                System.out.println(sum);
                break;

            case "subtract":
                int difference = calculator.subtract(scanner.nextInt(), scanner.nextInt());
                System.out.println(difference);
                break;

            case "multiply":
                int product = calculator.multiply(scanner.nextInt(), scanner.nextInt());
                System.out.println(product);
                break;

            case "divide":
                double quotient = calculator.divide(scanner.nextInt(), scanner.nextInt());
                System.out.println(quotient);
                break;

            case "fibonacci":
                int fibNumber = calculator.fibonacciNumberFinder(scanner.nextInt());
                System.out.println(fibNumber);
                break;

            case "binary":
                String binaryNumber = calculator.intToBinaryNumber(scanner.nextInt());
                System.out.println(binaryNumber);
                break;

            default:
                System.out.println("Invalid command");
                break;
        }
    }


}
