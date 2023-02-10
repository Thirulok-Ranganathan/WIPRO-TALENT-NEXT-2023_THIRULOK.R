import java.util.Arrays;

public class IsPalinPossible {
    public static void main(String[] args) {
        int input1 = 35463;
        String str = Integer.toString(input1);
        int count[] = new int[256];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++)
            count[(int) (str.charAt(i))]++;
        int odd = 0;
        for (int i = 0; i < 256; i++) {
            if ((count[i] & 1) == 1)
                odd++;
            if (odd > 1)
                System.out.print("1");
        }
        System.out.print("2");
    }
}
