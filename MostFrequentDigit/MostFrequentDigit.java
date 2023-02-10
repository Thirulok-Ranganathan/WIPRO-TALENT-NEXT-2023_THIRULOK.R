package MostFrequentDigit;

public class MostFrequentDigit {
    public static void main(String[] args) {
        int input1 = 132, input2 = 243, input3 = 323, input4 = 231;
        String allNo = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3)
                + String.valueOf(input4);
        int[] digitFrequency = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < allNo.length(); i++) {
            digitFrequency[Integer.parseInt(String.valueOf(allNo.charAt(i)))]++;
        }

        int mostFrequentDigit = 0;

        for (int i = 0; i <= 9; i++) {
            mostFrequentDigit = digitFrequency[i] >= digitFrequency[mostFrequentDigit] ? i : mostFrequentDigit;
        }

        System.out.print(mostFrequentDigit);
    }
}
