package lastDigitOfN;

public class lastDigitofN {
    public static void main(String[] args) {
        int input = 27;
        if (input > 10) {
            System.out.println(input % 10);
        } else if (input < 0) {
            System.out.println(Math.abs(input % 10));
        } else
            System.out.println(input);
    }
}
