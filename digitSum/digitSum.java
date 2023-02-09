package digitSum;

public class digitSum {
    public static void main(String[] args) {
        int input1=23;
        int neg=input1;
        if(input1<0)
        {
            input1*=-1;
        }
        int len=Integer.toString(input1).length();
        if(len==1)
        {
            if(neg<0)
                System.out.print(input1*-1);
            else
                System.out.print(input1);
        }
        else
        {
            int sum=0;
            while(input1!=0)
            {
                int rem=input1%10;
                sum+=rem;
                input1/=10;
            }
            if(neg<0)
                System.out.print(sum*-1);
             else
                System.out.print(sum);
        }
    }
}
