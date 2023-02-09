package UniqueDigitsCount;

public class UniqueDigitsCount {
    public static void main(String[] args) {
    int input1=234; 
    String str = Integer.toString(input1);

    int len=str.length();   

    int count=0;

    for(int i=0;i<len-1;i++){           

        for(int j=i+1;j<len;j++){               

            if(str.charAt(i)==str.charAt(j)) {           

                count++;                     
                break;                 
            }   
        } 
    }  
    System.out.print(len-count);
    }
}
