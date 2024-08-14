import java.util.Scanner;

public class homework_5 {

    static class homework1 {
        public static void main(String[] args) {
            int[] arr1 = new int[10];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = i;
            }

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += arr1[i];
            }

            System.out.println("Tổng của mảng là: " + sum);
        }
    }

    static class homework2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập độ dài mảng: ");
            int a = scanner.nextInt();
            int[] arr2 = new int[a];
            System.out.println("Nhập n: ");
            int n = scanner.nextInt();

            System.out.println("Nhập phần tử mảng: ");
            for (int i = 0; i < a; i++) {
                arr2[i] = scanner.nextInt();
            }

            int index = 0;
            for (int i = 0; i < a; i++) {
                if (n == arr2[i] ) {
                    index = i;
                }
            }
            if (index != 0) {
                System.out.println(n + " nằm ở vị trí " + index);
            } else {
                System.out.println("-1");
            }
        }
    }

    static class homework3 {

    }
}
