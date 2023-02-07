
class DigitofN {
    public static void main(String[] args) {
        int input1 = 52;
        int c;
        int b = String.valueOf(input1).length();
        if (b == 2 && b < 0)
            System.out.println(Math.abs(input1));
        else if (b == 1)
            System.out.println(Math.abs(input1));
        else if (b == 2) {
            input1 = input1 % 10;
            System.out.println(Math.abs(input1));
        } else {
            c = input1 / 10;
            input1 = c % 10;
            System.out.println(Math.abs(input1));
        }
    }
}