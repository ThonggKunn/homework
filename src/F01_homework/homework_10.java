package F01_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework_10 {

    static class homework1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num 1: ");
            int a = scanner.nextInt();
            System.out.println("Enter num 2: ");
            int b = scanner.nextInt();

             if (b == 0) {
                 try {
                     int divide = a/b;
                     System.out.println(divide);
                 } catch (ArithmeticException arithmeticException) {
                     System.out.println("Can't divide 0");
                 }
             } else {
                 System.out.println("The result is: " + a/b);
             }
        }
    }

    static class homework2 {

        public static int Integer(int n) {
            return n;
        }
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number: ");
                int a = scanner.nextInt();
                if (-a != -a) {
                    System.out.println("Not an Integer number!");
                    System.out.println("Enter integer number: ");
                    a = scanner.nextInt();
                } else {
                    System.out.println(homework2.Integer(a) + " is an integer number");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Please enter integer number!");
            } catch (Exception e) {
                System.out.println("Enter an integer number");
            }

        }
    }

    static class homework3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean result = false;

            try {

                System.out.println("Enter first number: ");
                int a = scanner.nextInt();
                System.out.println("Enter second number: ");
                int b = scanner.nextInt();
                int sum = a+b;
                System.out.println("The sum is " + sum);
                result = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid Number");
            } finally {
                if (result) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            }
        }
    }

    static class homework4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter array: ");
                int a = scanner.nextInt();

                for (int i = 1; i <= a; i++) {
                    System.out.println("Enter value at "+ i);
                    int b = scanner.nextInt();
                }
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("InputMismatchException");
            } finally {
                scanner.close();
            }
        }
    }

    static class homework5 {

        static class InvalidAgeException extends Exception {
            public InvalidAgeException (String message) {
                super(message);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter age: ");
                int age = scanner.nextInt();

                if (age < 18) {
                    throw new InvalidAgeException("Not old enough!");
                } else {
                    System.out.println("Done!");
                }
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class homework6 {

        static class NegativeNumberException extends Exception {
            public NegativeNumberException(String message) {
                super(message);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter number: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NumberFormatException("Invalid number");
                } else {
                    System.out.println("Done!");
                }
            } catch (NumberFormatException exception) {
                try {
                    throw new NegativeNumberException("Error: Number < 0");
                } catch (NegativeNumberException negativeNumberException) {
                    System.out.println(negativeNumberException.getMessage());
                }
            }
        }
    }

    static class homework8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter number: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new IllegalArgumentException("Invalid number");
                }

                double result = Math.sqrt(num);
                System.out.println("Square root of " + num + " is: " + result);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }
        }
    }

    static class homework9 {

        static class InsufficientFundsException extends Exception {
            public InsufficientFundsException (String message) {
                super(message);
            }
        }
        static class BankAccount {
            public static void WithDraw(double amount) throws InsufficientFundsException {
                int AccountBalance = 10000000;
                if (amount > AccountBalance) {
                    throw new InsufficientFundsException("Insufficient balance!");
                }
            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.println("Enter amount: ");
                    int amount = scanner.nextInt();
                    WithDraw(amount);
                    System.out.println("Success!");
                } catch (InsufficientFundsException insufficientFundsException) {
                    System.out.println(insufficientFundsException.getMessage());
                }
            }
        }


    }
}
