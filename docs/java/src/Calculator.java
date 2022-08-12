import java.util.Scanner;

public class Calculator {  
    public static void main(String[] args){

        powerOn();
        Scanner  sc = new Scanner(System.in);
        boolean run = true;
        while(run){
            int nData1= 0;
            int nData2= 0;
            System.out.println("--------------------------------------------------------");
            System.out.println("1. plus | 2. minus | 3. divide | 4. Multiply | 5. Exit");
            System.out.println("--------------------------------------------------------");
            System.out.print("Select> : ");
            int selectNum = sc.nextInt();
            switch(selectNum){
                case 1 :{
                    System.out.println("System.plus.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    int nPlusData = plus(nData1,nData2);
                    System.out.println("Answer : "+nPlusData);
    
                    break;
                } 
                case 2 :{
                    System.out.println("System.minus.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    int nMinusData= minus(nData1,nData2);
                    System.out.println("Answer : "+nMinusData);
                    break;
                } 
                case 3 :{
                    System.out.println("System.divide.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    double nDivideData= divide(nData1,nData2);
                    System.out.printf("answer =: %.2f\n",nDivideData);
                    break;
                    
                } 
                case 4 :{
                    System.out.println("System.multiply.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    int nMultiplyData= multiply(nData1,nData2);
                    System.out.println("Answer : "+nMultiplyData);
                    break;
                }
                case 5:{
                    run=false;
                    break;
                } 
                default : {
                    System.out.println("unable number...");
                    continue;
                }
            }
        }
        sc.close();
        powerOff();
    }
    public static void powerOn(){
        System.out.println("System...booting...");
    }
    public static int plus(int int1, int int2){
        int temp =int1+int2;
        return temp;
    }
    public static int minus(int int1, int int2){
        int temp =0;
        if(int1==int2){
            temp = 0;
        }else if(int1<int2){
            temp = int2-int1;
        }else{
            temp = int1-int2;
        }
        return temp;
    }
    public static double divide(int int1, int int2){
        double temp =int1/int2;
        return temp;
    }
    public static int multiply(int int1, int int2){
        int temp = int1*int2;
        return temp;
    }
    public static void powerOff(){
        System.out.println("End of program... ");
    }
}
