package NonRepeatedDigitsCount;

public class NonRepeatedDigitsCount {
    public static void main(String[] args) {
        int input1 = 2342;
        String str = Integer.toString(input1);
        int len = str.length();
        int count = 0, uni = 0;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = 0; j < len; j++) {
                if (i != j)
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                        break;
                    }
            }
            if (count == 0)
                uni++;
        }
        System.out.print(uni);
    }
}
