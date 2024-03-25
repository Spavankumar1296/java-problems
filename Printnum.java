public class Printnum {
    public static void main(String[] args) {
        fun(0);
    }

    static void fun(int n) {
        if (n <= 5) {

            System.out.println(n);
            fun(n + 1);
        }
    }

}
