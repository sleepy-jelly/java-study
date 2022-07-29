public class computer {
    public static void main(String[] args){
        int[] nint1 = {1,2,3,4,5};

        
        int nData1=sum1(10,2,5);
        int nData2=sum2(nint1);

        System.out.println("result of nData1 : "+nData1);

        System.out.println("result of nData2 : "+nData2);



        System.out.println("End of program... ");
    }

    public static int sum1(int ...values){
        int result=0;
        for(int i=0; i<values.length;i++){
            result+= values[i];
        }
        return result;
    }
    public static int sum2(int[] values){
        int result =0;

        for(int i=0; i<values.length;i++){
            result+= values[i];
        }

        return result;
    }
}
