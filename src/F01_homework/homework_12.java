package F01_homework;

import java.util.*;

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
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Integer> stack = new Stack<>();

            while (true) {
                String command = sc.next();

                switch (command) {
                    case "init":
                        stack = new Stack<>();
                        break;

                    case "push":
                        int x = sc.nextInt();
                        stack.push(x);
                        break;

                    case "pop":
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                        break;

                    case "top":
                        if (!stack.isEmpty()) {
                            System.out.println(stack.peek());
                        } else {
                            System.out.println(-1);
                        }
                        break;

                    case "size":
                        System.out.println(stack.size());
                        break;

                    case "empty":
                        System.out.println(stack.isEmpty() ? 1 : 0);
                        break;

                    case "end":
                        sc.close();
                        return;
                }
            }
        }
    }

    static class homework4 {
        public static void main(String[] args) {
            Deque<Integer> queue = new LinkedList<>();
            Deque<Object> result = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            while(n > 0){
                boolean flag = false;
                int choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        result.add(queue.size());
                        flag = true;
                        break;
                    case 2:
                        if(queue.isEmpty())
                            result.add("YES");
                        else
                            result.add("NO");
                        flag = true;
                        break;
                    case 3:
                        int num = scanner.nextInt();
                        queue.add(num);
                        flag = true;
                        break;
                    case 4:
                        if(!queue.isEmpty())
                            queue.poll();
                        flag = true;
                        break;
                    case 5:
                        if(!queue.isEmpty())
                            result.add(queue.peek());
                        else
                            result.add(-1);
                        flag = true;
                        break;
                    case 6:
                        if(!queue.isEmpty())
                            result.add(queue.getLast());
                        else
                            result.add(-1);
                        flag = true;
                        break;
                    default:
                        System.out.println("Nhập lại");
                        break;
                }
                if(flag) n--;
            }

            while (!result.isEmpty()){
                System.out.println(result.poll());
            }
        }
    }

    static class homework5 {
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
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter string: ");
            String string = scanner.nextLine();

            System.out.println(isTrue(string));
        }

    }

    static class homework7 {
        public static String convertToBinary(int decimal) {
            Stack<Integer> stack = new Stack<>();
            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                int remainder = decimal % 2;
                stack.push(remainder);
                decimal /= 2;
            }

            while (!stack.isEmpty()) {
                binary.append(stack.pop());
            }

            return binary.toString();
        }

        public static void main(String[] args) {
            int decimalNumber = 10;
            String binary = convertToBinary(decimalNumber);
            System.out.println("The binary of " + decimalNumber + " is: " + binary);
        }

    }

    static class homework8 {

        public static boolean isValidExpression(String string) {
            Stack<Character> stack = new Stack<>();

            for (char c : string.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter string: ");
            String string = scanner.nextLine();

            System.out.println(isValidExpression(string));
        }
    }

    static class homework9 {
        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class SinglyLinkedList {
            Node head;

            public SinglyLinkedList() {
                this.head = null;
            }

            public void insert(int data) {
                Node newNode = new Node(data); // Tạo một nút mới
                if (head == null) {
                    head = newNode;
                } else {
                    Node current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode;
                }
            }

            public void delete(int data) {
                if (head == null) {
                    System.out.println("Danh sách rỗng.");
                    return;
                }
                if (head.data == data) {
                    head = head.next;
                    return;
                }

                Node current = head;
                while (current.next != null && current.next.data != data) {
                    current = current.next;
                }

                if (current.next != null) {
                    current.next = current.next.next;
                } else {
                    System.out.println("Không tìm thấy phần tử " + data);
                }
            }

            public void showNode() {
                if (head == null) {
                    System.out.println("Danh sách rỗng.");
                    return;
                }

                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }

        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);

            System.out.println("Danh sách sau khi thêm các phần tử:");
            list.showNode();

            list.delete(20);
            System.out.println("Danh sách sau khi xóa phần tử 20:");
            list.showNode();
            
            list.delete(50);
            System.out.println("Danh sách sau khi thử xóa phần tử không tồn tại:");
            list.showNode();
        }
    }
}
