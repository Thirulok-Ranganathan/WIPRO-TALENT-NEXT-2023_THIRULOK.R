package NoOfPrimesInARange;

public class NoOfPrimesInARange {
    public static void main(String[] args) {
        int input1=0,input2=0,count=0,k=0;
        while(input1<=input2){
            for(int i=2;i<input1;i++){
                if(input1%i==0)
                    k++;
            }
            if(k==0)
                count++;
            input1++;
            k=0;
        }
        System.out.print(count);
    }
}
