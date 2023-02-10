class word2Uppercase {
    public static void main(String[] args) {
        String input1 = "Browsing around the vscode";
        String strArray[] = input1.split(" ");
        String wrong = "LESS";
        if (strArray.length == 1) {
            System.out.print(wrong);
        }
        System.out.print(strArray[1].toUpperCase());
    }
}