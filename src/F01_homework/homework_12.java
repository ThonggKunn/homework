package F01_homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class homework_12 {

    static class homework1 {

        public static int[][] pascal_triangle(int numRows) {
            int[][] triangle = new int[numRows][];
            for (int i = 0; i < numRows; i++) { //tao hang cua mang
                triangle[i] = new int[i + 1]; // tao kich thuoc cua moi mang

                triangle[i][0] = 1; // phan tu dau
                triangle[i][i] = 1; // phan tu cuoi

                for (int j = 1; j < i; j++) { // tinh phan tu giua
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
            return triangle;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numrows: ");
            int numRows = scanner.nextInt();
            int[][] result = pascal_triangle(numRows);

            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        }
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

    static class homework3 {
        private static boolean pairBracket(char open, char close) {
            return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
        }

        public static boolean isTrue(String string) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < string.length(); i++) { //duyet mang
                char c = string.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c); // ngoac mo -> day vao stack
                }
                else if (c == ')' || c == '}' || c == ']') { // ngoac dong -> kiem tra stack
                    if (stack.isEmpty()) { // stack rong -> false
                        return false;
                    }
                    char openBracket = stack.pop();
                    if (!pairBracket(openBracket, c)) { //kiem tra ngoac mo co khop ngoac dong khong
                        return false;
                    }
                }
            }

        }

    }

}
