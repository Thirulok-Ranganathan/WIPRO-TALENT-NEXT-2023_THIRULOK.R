package nFactorial;

public class nFactorial {
    public static void main(String[] args) {
        int input1=5;
        int factorial=1;
        for(int i=1;i<=input1;i++){
            factorial=i*factorial;
        }
        System.out.println(factorial);
    }
}
