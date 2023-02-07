package Of5HowManyAreEvenOdd;

public class Of5HowManyAreEvenOdd {
    public static void main(String[] args) {
        int input1=12;
        int input2=22;
        int input3=14;
        int input4=7;
        int input5=45;
        String input6="Even";
        int count=0;
        if(input6.equalsIgnoreCase("odd")){
            if(input1%2!=0)
                count++;
            if(input2%2!=0)
                count++;
            if(input3%2!=0)
                count++;
            if(input4%2!=0)
                count++;
            if(input5%2!=0)
                count++;
        }
        else if(input6.equalsIgnoreCase("even")){
            if(input1%2==0)
                count++;
            if(input2%2==0)
                count++;
            if(input3%2==0)
                count++;
            if(input4%2==0)
                count++;
            if(input5%2==0)
                count++;
        }
        System.out.println(count);
    }
}
