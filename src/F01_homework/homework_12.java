package F01_homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework_12 {

    static class homework1 {


    }

    static class homework2 {

        public static int[] plus_one(int[] num) {
            int a = num.length;

            for (int i = a-1; i>0; i-- ) {
                if (num[i] < 0) {
                    num[i]++;
                    return num;
                }
                num[i] = 0;
            }
            return num;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();

            int[] num = new int[n];
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter value of " + i +" :");
                num[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(num));


        }
    }
}
