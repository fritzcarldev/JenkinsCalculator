import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
//        String command = scanner.next();
        boolean quit = false;
        while (!quit) {
            String command = scanner.next();
            if (command.equals("quit")) {
                quit = true;
            }
            if (command.equals("add")) {
                int sum = calculator.add(scanner.nextInt(), scanner.nextInt());
                System.out.println(sum);
            }
            if (command.equals("subtract")) {
                int difference = calculator.subtract(scanner.nextInt(), scanner.nextInt());
                System.out.println(difference);
            }

            if (command.equals("multiply")) {
                int product = calculator.multiply(scanner.nextInt(), scanner.nextInt());
                System.out.println(product);
            }

            if (command.equals("divide")) {
                double quotient = calculator.divide(scanner.nextInt(), scanner.nextInt());
                System.out.println(quotient);
            }

            if (command.equals("fibonacci")) {
                int fibNumber = calculator.fibonacciNumberFinder(scanner.nextInt());
                System.out.println(fibNumber);
            }

            if (command.equals("binary")) {
                String binaryNumber = calculator.intToBinaryNumber(scanner.nextInt());
                System.out.println(binaryNumber);
            }

            }

        }
    }
