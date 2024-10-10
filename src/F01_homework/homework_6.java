package F01_homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework_6 {

    static class homework1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();

            int[] array = new int[n];
            int[] array2 = new int[n];

            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                array2[i] = 0;
            }

            System.out.println("Giá trị và số lần xuất hiện:");
            for (int i = 0; i < n; i++) {
                if (array2[i] == 0) {
                    int count = 1;

                    for (int j = i + 1; j < n; j++) {
                        if (array[i] == array[j]) {
                            count++;
                            array2[j] = 1;
                        }
                    }
                    System.out.println(array[i] + " xuất hiện " + count + " lần");
                }
            }
        }
    }

    static class homework2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();
            int[] Arr = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                Arr[i] = scanner.nextInt();
            }

            Arrays.sort(Arr);

            int left = 0;
            int right = n - 1;

            System.out.println();
            while (left <= right) {
                if (left != right) {
                    System.out.print(Arr[right] + " " + Arr[left] + " ");
                } else {
                    System.out.print(Arr[right]);
                }
                left++;
                right--;
            }
        }
    }

    static class homework3 {
        public static void main(String[] args) {
            int[] array1 = {1, 3, 5, 7};
            int[] array2 = {2, 4, 6, 8, 10};
            int[] mergedArray = mergeArrays(array1, array2);
            System.out.println("Array after mixed: " + Arrays.toString(mergedArray));
        }
        public static int[] mergeArrays(int[] array1, int[] array2) {
            int n1 = array1.length;
            int n2 = array2.length;
            int[] newArr = new int[n1 + n2];

            int i = 0, j = 0, k = 0;

            while (i < n1 && j < n2) {
                if (array1[i] <= array2[j]) {
                    newArr[k++] = array1[i++];
                } else {
                    newArr[k++] = array2[j++];
                }
            }
            while (i < n1) {
                newArr[k++] = array1[i++];
            }
            while (j < n2) {
                newArr[k++] = array2[j++];
            }
            return newArr;
        }
    }


    static class homework4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            System.out.println("Enter k: ");
            int k = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter a[" + i + "]: " );
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            if (k == 0) {
                if (a[0] > 1) {
                    System.out.println(1);
                } else {
                    System.out.println("-1");
                }
            } else {
                if (k < n && a[k - 1] == a[k]) {
                    System.out.println("-1");
                } else {
                    System.out.println(a[k - 1]);
                }
            }
        }
    }

    static class homework5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count25 = 0, count50 = 0;
            for (int i = 0; i < n; i++) {
                int bill = scanner.nextInt();
                switch (bill) {
                    case 25:
                        count25++;
                        break;
                    case 50:
                        if (count25 > 0) {
                            count25--;
                            count50++;
                        } else {
                            System.out.println("NO");
                            return;
                        }
                        break;
                    case 100:
                        if (count50 > 0 && count25 > 0) {
                            count50--;
                            count25--;
                        } else if (count25 >= 3) {
                            count25 -= 3;
                        } else {
                            System.out.println("NO");
                            return;
                        }
                        break;
                    default:
                        System.out.println("NO");
                        return;
                }
            }
            System.out.println("YES");
        }
    }

    static class homework6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter A: ");
            int A = scanner.nextInt();
            System.out.print("Enter B: ");
            int B = scanner.nextInt();
            System.out.print("Enter V: ");
            int V = scanner.nextInt();

            int days = (V - B) / (A - B);
            if ((V - B) % (A - B) != 0) {
                days++;
            }

            System.out.println(days);
        }
    }

    static class homework7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter red shoe: ");
            int m = scanner.nextInt();
            System.out.println("Enter blue shoe: ");
            int n = scanner.nextInt();

            int daysWithDifferentColors = Math.min(m, n);

            int remainingShoes = Math.abs(m - n);
            int daysWithSameColor = remainingShoes / 2;

            System.out.println(daysWithDifferentColors + " " + daysWithSameColor);
        }
    }
}
