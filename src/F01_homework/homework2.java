package F01_homework;

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

    static class homework_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive number < 1000: ");

            int number = scanner.nextInt();
            if (number <= 0 || number >= 1000) {
                System.out.println("The input number must be a smaller positive integer < 1000");
            } else {
                String romanNumeral = "";
                int tempNumber = number;

                if (tempNumber >= 900) {
                    romanNumeral += "CM";
                    tempNumber -= 900;
                } else if (tempNumber >= 500) {
                    romanNumeral += "D";
                    tempNumber -= 500;
                } else if (tempNumber >= 400) {
                    romanNumeral += "CD";
                    tempNumber -= 400;
                } else {
                    while (tempNumber >= 100) {
                        romanNumeral += "C";
                        tempNumber -= 100;
                    }
                }

                if (tempNumber >= 90) {
                    romanNumeral += "XC";
                    tempNumber -= 90;
                } else if (tempNumber >= 50) {
                    romanNumeral += "L";
                    tempNumber -= 50;
                } else if (tempNumber >= 40) {
                    romanNumeral += "XL";
                    tempNumber -= 40;
                } else {
                    while (tempNumber >= 10) {
                        romanNumeral += "X";
                        tempNumber -= 10;
                    }
                }

                if (tempNumber == 9) {
                    romanNumeral += "IX";
                    tempNumber -= 9;
                } else if (tempNumber >= 5) {
                    romanNumeral += "V";
                    tempNumber -= 5;
                } else if (tempNumber == 4) {
                    romanNumeral += "IV";
                    tempNumber -= 4;
                } else {
                    while (tempNumber >= 1) {
                        romanNumeral += "I";
                        tempNumber -= 1;
                    }
                }
                System.out.println("The roman number is: " + romanNumeral);
            }
            scanner.close();
        }
    }

    static class homework7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter edge a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter edge b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter edge c: ");
            double c = scanner.nextDouble();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("This is a triangle ");

                if (a == b && b == c) {
                    System.out.println("This is an equilateral triangle.");
                } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("This is a right triangle.");
                } else if (a == b || a == c || b == c) {
                    System.out.println("This is an isosceles triangle.");
                } else {
                    System.out.println("This is a normal triangle.");
                }

                double perimeter = a + b + c;
                System.out.println("The perimeter of the triangle is: " + perimeter);

                double p = perimeter / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("The area of the triangle is: " + area);

            } else {
                System.out.println("These three numbers cannot form a triangle.");
            }
        }
    }

    static class homework8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
            scanner.close();
        }
    }

    static class homework10 {
        public static void calculateBanknotes(int amount) {
            int[] denominations = {500, 200, 100, 20, 10, 5, 2, 1};
            int total = 0;
            for (int denomination : denominations) {
                int count = amount / denomination;
                if (count > 0) {
                    System.out.println(denomination + " VND: " + count + " bills");
                    total += count;
                    amount %= denomination;
                }
            }
            System.out.println("Total number of sheets: " + total);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: ");
            int amount = scanner.nextInt();
            calculateBanknotes(amount);
            scanner.close();
        }
    }
}
