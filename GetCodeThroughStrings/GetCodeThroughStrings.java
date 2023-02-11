public class GetCodeThroughStrings {
    public static void main(String[] args) {
        String input1 = "Hello User";
        String word[] = input1.split(" ");
        int sum = 0;
        for (int i = 0; i < word.length; i++) {
            sum += word[i].length();
        }
        System.out.print((1 + (sum - 1) % 9));
    }
}
