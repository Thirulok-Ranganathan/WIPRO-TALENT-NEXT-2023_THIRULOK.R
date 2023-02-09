package NthPrime;

public class NthPrime {
    public static void main(String[] args) {
        int count=0,pcount=0,i,input1=10;
  for(i=2;i<=100000;i++)
  {
   count=0;
   for(int j=2;j<=Math.sqrt(i);j++)
   {
    if(i%j==0)
     count++;
   }
   if(count==0)
    pcount++;
   if(pcount==input1)
    break;
  }
  System.out.print(i);
    }
}
