public class Factorial {
    public static void main(String[] args) {
        // fact(5);
        System.out.println(fact(-2));
    }

    static int fact(int n) {
        if (n < 0) {
            return -1;
        } else if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
}
