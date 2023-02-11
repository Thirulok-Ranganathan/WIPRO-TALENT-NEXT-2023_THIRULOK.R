package SimpleEncodedArray;

public class SimpleEncodedArray {
    public final int output1;
    public final int output2;

    public SimpleEncodedArray(int out1, int out2) {
        output1 = out1;
        output2 = out2;
    }

    public class findOutput {
        public static void main(String[] args) {
            int[] input1 = { 2, 4, 6, 8, 5 };
            int input2 = 4;
            int[] arr = new int[input2];
            arr[input2 - 1] = input1[input2 - 1];
            int sum = arr[input2 - 1];
            for (int i = input2 - 2; i >= 0; i--) {
                arr[i] = input1[i] - arr[i + 1];
                sum += arr[i];
            }
            SimpleEncodedArray r1 = new SimpleEncodedArray(arr[0], sum);
            System.out.print(r1);
        }
    }
}
