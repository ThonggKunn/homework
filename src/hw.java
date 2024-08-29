public class hw {
    public static void main(String[] args) {
        System.out.println(hw.avg(0));
    }

    public static int avg(int n) {
        try {
            return 10 /n;
        } catch (IllegalArgumentException ex) {
            System.out.println("A ex");
        }

        return 0;
    }
}