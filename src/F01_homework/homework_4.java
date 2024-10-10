package F01_homework;

import java.util.Scanner;

public class homework_4 {

    static class homework1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();

            for (int i = n; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }

    static class homework2 {
        public static void main(String[] args) {
            System.out.println("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (a >= 'a' && a <= 'z') {
                    if (a == 'u' || a == 'e' || a == 'o' || a == 'a' || a == 'i') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("The vowels is: " + vowels);
            System.out.println("The consonants is: " + consonants);
            scanner.close();
        }
    }

    static class homework3 {
        public static void main(String[] args) {
            System.out.println("Enter input: " );
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            System.out.println("Pic A");
            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Pic B");
            for (int i = input; i >= 1;i--) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Pic C");
            for (int i = 1; i <= input; i++) {
                for (int j = input - i; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Pic D");
            for (int i = 1; i <= input; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = input; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    static class homework4 {
        public static void main(String[] args) {
            for (int i = 2; i <= 10; i++) {
                System.out.println("Bảng chia cho " + i);
                for (int j = 2; j <= 100; j++) {
                    if (j % i == 0 && j / i <= 10) {
                        System.out.println(j + "/" + i + "=" + j/i);
                    }
                }
                System.out.println();
            }
        }
    }

    static class homework5 {
        private static int checksum(String ISBM12){
            int sum = 0;
            for (int i = 0; i < ISBM12.length(); i++){
                if (i % 2 == 0)
                    sum += (ISBM12.charAt(i) - '0');
                else
                    sum += 3*(ISBM12.charAt(i) - '0');
            }
            int checksum = 10 -sum%10;
            if (checksum == 10)
                checksum = 0;
            return checksum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string 12 numbers: ");
            String ISBM12Sequences = scanner.next();

            while(ISBM12Sequences.length() != 12){
                System.out.print("Invalid String. Enter again: ");
                ISBM12Sequences = scanner.next();
            }
            System.out.println("So ISBN-13: " + ISBM12Sequences + checksum(ISBM12Sequences));
            scanner.close();
        }
    }

    static class homework6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the sequence: ");
            int n = scanner.nextInt();

            if (n < 2) {
                System.out.println("The sequence must have at least two elements.");
                return;
            }

            int[] array = new int[n];
            System.out.println("Enter the elements of the sequence:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int secondLargest = findSecondNumber(array);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("Second largest number not found (elements are the same).");
            } else {
                System.out.println("The second largest number of the sequence is: " + secondLargest);
            }
        }

        public static int findSecondNumber(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }
    }

    static class homework7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter positive integer n: ");
            int n = scanner.nextInt();

            while(n <= 0){
                System.out.print("Invalid n. Enter again: ");
                n = scanner.nextInt();
            }

            System.out.print("The "+ n + " fibonacci is : " + fibonacci(n));

            scanner.close();
        }

        private static int fibonacci(int n) {
            if(n == 1 || n == 2)
                return 1;
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static class homework8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào giá trị của n: ");
            int n = scanner.nextInt();

            System.out.println("Các số chính phương nhỏ hơn " + n + " là:");
            for (int i = 1; i * i < n; i++) {
                System.out.println(i * i);
            }
        }
    }
}
