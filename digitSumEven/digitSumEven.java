public class digitSumEven {
    public static void main(String[] args) {
        int sum=0,input1=3432;
        while(input1!=0)
        {
            int n=input1%10;
            if(n%2==0)
                sum+=n;
                input1/=10; 
        }
        System.out.print(sum);
    }
}
