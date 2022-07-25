import java.util.Scanner;


public class Exercise07 {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        int nData= 0;

       Outter: while(run){
            System.out.println("---------------------------------------------");
            System.out.println("1. Deposit 2. Withdraw 3. balances 4. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("select> ");
            int nSelect = sc.nextInt();
            switch(nSelect){
                case 1:
                 System.out.println("Deposit amount> ");
                 nData=sc.nextInt();
                 if(nData<0){
                    System.out.println("Deposit amount is lower than 0> ");
                     break;
                 }
                 balance+=nData;
                        break;
                case 2:
                
                 System.out.println("Withdraw amount> ");
                 nData=sc.nextInt();
                 if(nData>balance){
                    System.out.println("Withdraw amount is bigger than balances> ");

                     break;
                 }
                 balance-=nData;
                        break;
                case 3:               
                 System.out.println("balances amount> "+balance);
                        break;
                case 4:
                 run=false;
                    break Outter;
                }
            System.out.print('\n');
          }
         sc.close();
         System.out.println("End of program... ");

      }

 }

