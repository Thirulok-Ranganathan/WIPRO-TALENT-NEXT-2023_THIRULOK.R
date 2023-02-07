class ofHowManyAreEven{
    public static void main(String[] args) {
        int input1=24;
        int input2=14;
        int input3=22;
        int input4=32;
        int input5=53;
        int count=0;
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
        System.out.println(count);
    }
}