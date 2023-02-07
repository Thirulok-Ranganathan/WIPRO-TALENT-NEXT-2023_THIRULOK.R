package isPrime;

public class isPrime {
    public static void main(String[] args) {
        int input1=56;
        int ans=0;
        for(int i=1;i<=input1;i++){
            if(input1%i==0){
                ans++;
            }
        }
        if(ans==2){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}
