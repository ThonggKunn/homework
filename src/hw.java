import java.util.Scanner;

public class hw {
//    static class F01_homework.homework1 {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter n: ");
//            int n = scanner.nextInt();
//
//            for (int i = n; i >= 1; i--) {
//                for (int j = i; j >= 1; j--) {
//                    System.out.print(j + " ");
//                }
//                for (int j = 2; j <= i ; j++) {
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//            }
//            scanner.close();
//        }
//    }

    static class homework_5 {
        public static void main(String[] args) {
            int[] binaryNum = new int[1000];
            Scanner scanner = new Scanner(System.in);
            int decimal = scanner.nextInt();
            int i = 0;
            while (decimal > 0) {
                binaryNum[i] = decimal % 2;
                decimal = decimal / 2;
                i++;
            }

            for (int j = i - 1; j <= 0; j++) {
                System.out.println(binaryNum[j]);
            }


//            String binary = scanner.next();






        }
    }
    static class c1 {
        public static void main(String[] args) {
            int a = 12;
            int b =5;

            int c = a;
            c += b;
            System.out.println(c);
            System.out.println(a);
        }
    }

    public static class BubbleSort {
        public static void main(String[] args) {
            int temp;
//            for (int i = 0;)
        }
    }
}
