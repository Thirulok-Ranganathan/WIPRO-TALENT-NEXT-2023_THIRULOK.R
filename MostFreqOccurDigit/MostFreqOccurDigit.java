package MostFreqOccurDigit;

public class MostFreqOccurDigit {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] input1 = { 1237, 262, 666, 140 };
        int input2 = 4;
        for (int i = 0; i < input2; i++) {
            while (input1[i] != 0) {
                int rem = input1[i] % 10;
                arr[rem]++;
                input1[i] /= 10;
            }
        }
        int max = 0;
        int higest_occur_number = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                higest_occur_number = i;
            }
        }
        System.out.print(higest_occur_number);
    }
}
