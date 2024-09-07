import java.util.Scanner;

public class homework_3 {

    static class homework1 {
        public static void main(String[] args) {
            String a = "Hello World";
            System.out.println(a);
        }
    }

    static class homework2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num: ");
            int num = scanner.nextInt();
            if (num>0) {
                System.out.println(num + " is positive number" );
            } else
                System.out.println(num + " is negative number");

            if (num%2==0) {
                System.out.println(num + " is even ");
            } else
                System.out.println(num + " is odd ");
        }
    }

    static class homework3 {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();

            int addition = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            if (b != 0) {
                float division = (float) a / b;
                System.out.println("Division is: " + division);
            } else
                System.out.println("Can not divide by 0");


            System.out.println("Addition is: " + addition);
            System.out.println("Subtraction is: " + subtraction);
            System.out.println("Multiplication is: " + multiplication);

        }
    }

    static class homework4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();

            if (a>b) {
                System.out.println(a + " > " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);
            } else
                System.out.println(a + " = " + b);
        }
    }

    static class homework5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length: ");
            int length = scanner.nextInt();
            System.out.println("Enter width: ");
            int width = scanner.nextInt();

            int acreage = length * width;
            int perimeter = (length + width) * 2;

            System.out.println("The acreage is " + acreage);
            System.out.println("The perimeter is " + perimeter);
        }
    }

    static class homework6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter edge1: ");
            int edge1 = scanner.nextInt();
            System.out.println("Enter edge2: ");
            int edge2 = scanner.nextInt();
            System.out.println("Enter edge3: ");
            int edge3 = scanner.nextInt();

            if (edge1 + edge2 > edge3) {
                System.out.println("This is a triangle!");
            } else if (edge1 + edge3 > edge2) {
                System.out.println("This is a triangle!");
            } else if (edge2 + edge3 > edge1) {
                System.out.println("This is a triangle!");
            }
        }
    }
}
