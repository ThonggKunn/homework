package F01_homework;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
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

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first number: ");
                int a = scanner.nextInt();

                System.out.println("Enter second number: ");
                int b = scanner.nextInt();

                int sum = a+b;

                System.out.println("The sum is " + sum);
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Error");
            } finally {
                System.out.println("Wrong type of number");
            }
        }
    }

    static class homework4 {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
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
            }
        }
    }
}
