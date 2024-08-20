package F01_homework;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
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
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số dòng của ma trận: ");
            int m = scanner.nextInt();
            System.out.println("Nhập số cột của ma trận: ");
            int n = scanner.nextInt();

            int[][] arr3 = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("A[" + i + "][" + j + "]");
                    arr3[i][j] = scanner.nextInt();
                }
            }

            int max = arr3[0][0];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max < arr3[i][j]) {
                        max = arr3[i][j];
                    }
                }
            }
            System.out.println("Giá trị lớn nhất của mảng là " + max);
        }
    }

    static class homework4 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập kích thước chiều 1: ");
            int a = scanner.nextInt();

            System.out.print("Nhập kích thước chiều 2: ");
            int b = scanner.nextInt();

            System.out.print("Nhập kích thước chiều 3: ");
            int c = scanner.nextInt();

            int[][][] array = new int[a][b][c];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                        System.out.print("Nhập phần tử tại vị trí [" + i +"]" +"[" + j +"]" + "[" + k +"]");
                        array[i][j][k] = scanner.nextInt();
                    }
                }
            }
            PrintWriter writer = new PrintWriter("C:\\Users\\84949\\Downloads\\homework_1\\src\\text.txt");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                        System.out.print("array[" + i +"]" +"[" + j +"]" + "[" + k +"]");
                        writer.write(array[i][j][k] + " ");
                    }
                    writer.write("\n");
                }
                writer.write("\n");
            }
            writer.close();
        }
    }

    static class homework5 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File("C:\\Users\\84949\\Downloads\\homework_1\\src\\ex5_hw5.txt"));
            PrintWriter writer = new PrintWriter("C:\\Users\\84949\\Downloads\\homework_1\\src\\ex5_2_hw5.txt");
            int sum = 0;
            while (scanner.hasNext()) {
                int nums = scanner.nextInt();
                System.out.println(nums);
                sum += nums;
            }
            writer.write("The sum is: " + sum);
            writer.close();

        }

        static class homework6 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter n: ");
                int n = scanner.nextInt();

                int[] arr6 = new int[n];

                for (int i = 0; i < arr6.length; i++) {
                    System.out.println("Arr6[" + i +"] =");
                    arr6[i] = scanner.nextInt();
                }

                int result = 1;

                for (int i = 0; i < n / 2; i++) {
                    if (arr6[i] != arr6[n - i - 1]) {
                        result = 0;
                        break;
                    }
                }

                if (result == 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }

    static class homework7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter test case: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter a: ");
                int a = scanner. nextInt();
                System.out.println("Enter b: ");
                int b = scanner.nextInt();

                int gcd = 0;
                for (int j = 1; j <= a && i <= b; j++) {
                    if (a % j == 0 && b % j == 0) {
                        gcd = j;
                    }
                }
                int lcm = (a/gcd)*b;

                System.out.println(gcd + " " + lcm);
            }
        }
    }

//    static class homweork8 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            int testcase = sc.nextInt();
//
//            while (testcase-- > 0) {
//                int N = sc.nextInt();
//                int[] Arr8 = new int[N];
//
//                for (int i = 0; i < N; i++) {
//                    Arr8[i] = sc.nextInt();
//                }
//            }
//        }
//    }
}
