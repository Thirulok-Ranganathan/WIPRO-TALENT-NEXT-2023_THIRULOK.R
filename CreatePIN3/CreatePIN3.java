package CreatePIN3;

public class CreatePIN3 {
    public static void main(String[] args) {
        int input1 = 213, input2 = 454, input3 = 183;
        int arr[] = { input1, input2, input3 };
        int max = 0, min;
        double sum = 0.0;
        double place = 1.0;
        int num;
        for (int i = 0; i < 3; i++) {
            num = arr[i];
            while (num != 0) {
                int r = num % 10;
                if (r > max)
                    max = r;
                num = num / 10;
            }
        }
        for (int i = 0; i < 3; i++) {
            min = 99;
            for (int j = 0; j < 3; j++) {
                int rem = arr[j] % 10;
                if (rem < min)
                    min = rem;
                arr[j] /= 10;
            }
            sum = (min + (sum / place));
            sum *= place;
            place *= 10;
        }
        System.out.print(max * 1000 + sum);
    }
}
