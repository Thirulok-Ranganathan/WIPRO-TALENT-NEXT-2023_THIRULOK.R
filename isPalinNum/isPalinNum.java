package isPalinNum;

public class isPalinNum {
    public static void main(String[] args) {
        int input1 = 2002;
        String str = Integer.toString(input1);
        int len = str.length();
        String str1 = "";
        for (int i = len - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        if (str.equals(str1))
            System.out.print("2");
        else
            System.out.print("1");
    }
}
