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
