public class Sumofnum {
    public static void main(String[] args) {

        System.out.println(reverse(12345));
    }

    static int reverse(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + (reverse(num / 10));

    }

}
