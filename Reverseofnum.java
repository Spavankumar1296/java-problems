public class Reverseofnum {
    public static void main(String[] args) {
        reverse(1234);
        System.out.println();
        reverse(9248);
    }

    static void reverse(int num) {
        int sum = 0;
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        sum = (sum * 10) + rem;
        System.out.print(sum);
        reverse(num / 10);

    }
}
