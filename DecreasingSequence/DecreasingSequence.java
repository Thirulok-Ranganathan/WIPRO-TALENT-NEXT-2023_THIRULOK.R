package DecreasingSequence;

public class DecreasingSequence {
    public int output1;
    public int output2;

    public DecreasingSequence(int out1, int out2) {
        output1 = out1;
        output2 = out2;
    }

    public class Result {
        public static void main(String[] args) {
            int c1 = 0, c2 = 0, max = 0;
            int[] input1 = { 3, 7, 5, 8, 6, 2, 1, 12, 10, 9, 4 };
            int input2 = 11;
            for (int i = 0; i < input2 - 1; i++) {
                if (input1[i] > input1[i + 1]) {
                    c1++;
                }
                if ((input1[i] < input1[i + 1] && c1 != 0) || ((i == input2 - 2) && c1 != 0)) {
                    if (max < c1) {
                        max = c1;
                    }
                    c2++;
                    c1 = 0;
                }
            }
            max = max + 1;
            if (c2 == 0) {
                max = 0;
            }
            if (input2 == 0) {
                max = 0;
                c2 = 0;
            }
            DecreasingSequence r1 = new DecreasingSequence(c2, max);
            System.out.print(r1);
        }
    }
}