import java.util.Scanner;

public class homework2 {

    static class homework_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();

            double b = a * 2.45;
            System.out.println("The result is: " + b);
        }
    }

    static class homework_2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter C degree: ");
            double C = scanner.nextDouble();
            System.out.print("Enter F degree: ");
            double F = scanner.nextDouble();

            double CtoF = ((((double)9/5)*C) + 32);
            double FtoC = (((double)5/9)*(F-32));

            System.out.println("CtoF is " + CtoF);
            System.out.println("FtoC is " + FtoC);
        }
    }

    static class homework_3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter minute: ");
            int min = scanner.nextInt();

            int minAYear = 365 * 24 * 60;
            int minADay = 24 * 60;
            int minAHour = 60;

            int year = min / minAYear;
            min %= minAYear;
            int day = min / minADay;
            minADay %= minADay;
            int hour = min / minAHour;
            min %= minAHour;
            System.out.println(year + " year " + day + " days " + hour + " hours " + min + " minutes");

        }
    }

    static class homework_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = 1;
            
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("The result is: " + result);
        }
    }

    static class homework_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter decimal number: ");
            int decimal = scanner.nextInt();
            System.out.println("Enter binary number: ");
            String binary = scanner.next();

            System.out.println("The binary number is: " + (Integer.toBinaryString(decimal)));
            System.out.println("The decimal number is: " + (Integer.parseInt(binary,2)));

//            int[] binaryNum = new int[1000];
//            Scanner = new Scanner(System.in);
//            int decimal = scanner.nextInt();
//            int i = 0;
//            while (decimal > 0) {
//                binaryNum[i] = decimal % 2;
//                decimal = decimal / 2;
//                i++;
//            }
//
//            for (int j = i - 1; j <= 0; j++) {
//                System.out.println(binaryNum[j]);
//            }
        }
    }

//    static class homework_6 {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//
//            if (number <= 0 || number >= 1000) {
//                System.out.println("Error");
//            } else {
//                System.out.println("The Roman number is: ");
//            }
//        }
//    }
}
