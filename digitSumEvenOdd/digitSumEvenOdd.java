package digitSumEvenOdd;

public class digitSumEvenOdd {
    public static void main(String[] args) {
        int sum = 0, input1 = 123;
        String input2 = "even";
        if (input2.equals("even")) {
            while (input1 != 0) {
                int n = input1 % 10;
                if (n % 2 == 0)
                    sum += n;
                input1 /= 10;
            }
        } else {
            while (input1 != 0) {
                int n = input1 % 10;
                if (n % 2 != 0)
                    sum += n;
                input1 /= 10;
            }
        }
        System.out.print(sum);
    }
}
