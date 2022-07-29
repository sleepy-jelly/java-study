import java.util.Scanner;

public class Calculator {  
    public static void main(String[] args){

        powerOn();
        Scanner  sc = new Scanner(System.in);
        boolean run = true;
        while(run){
            int nData1= 0;
            int nData2= 0;
            System.out.println("--------------------------------");
            System.out.println("1. plus | 2. divide |  3. Exit ");
            System.out.println("--------------------------------");
            System.out.print("Select> : ");
            int selectNum = sc.nextInt();
            switch(selectNum){
                case 1 :{
                    System.out.println("System.plus.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    plus(nData1,nData2);
                    break;
                } 
                case 2 :{
                    System.out.println("System.divide.unit...");
                    System.out.println("Please input first int.");
                    nData1=sc.nextInt();
                    System.out.println("Please input second int.");
                    nData2=sc.nextInt();
                    divide(nData1,nData2);
                    break;
                } 
                case 3 :{
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
        System.out.println("Answer : "+temp);
        return temp;
    }
    public static double divide(int int1, int int2){
        double temp =int1/int2;
        System.out.println("Answer : "+temp);
        return temp;
    }
    public static void powerOff(){
        System.out.println("End of program... ");
    }
}
