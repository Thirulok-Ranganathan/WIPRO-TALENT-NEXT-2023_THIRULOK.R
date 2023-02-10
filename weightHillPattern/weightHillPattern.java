package weightHillPattern;

public class weightHillPattern {
    public static void main(String[] args) {
        int sum = 0, input1 = 5, input2 = 10, input3 = 2;
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                sum += input2;
            }
            input2 += input3;
        }
        System.out.print(sum);
    }
}
