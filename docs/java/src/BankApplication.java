import java.util.Scanner;

public class BankApplication {
      private static Account20[] accountArray = new Account20[100];
      private static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args){

        boolean run =true;

        while(run){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1.create account | 2.account list | 3.deposit | 4. withdraw | 5. exit ");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("select> ");            
            
            int SelectNo = sc1.nextInt();

            if(SelectNo==1){
                createAccount();

            }else if(SelectNo==2){
                accountList();

            }else if(SelectNo==3){
                deposit();

            }else if(SelectNo==4){
                withdraw();

            }else if(SelectNo==5){
                run=false;
            }     

        }
        System.out.println("Progream is ovver...");

        sc1.close();
    }
    private static void createAccount(){
        String ano, owner;
        int balance;
        ano = sc1.nextLine();
        owner = sc1.nextLine();
        balance = sc1.nextInt();

        Account20(ano,owner,balance);
        
    }
    private static void accountList(){

    }
    private static void deposit(){

    }
    private static void withdraw(){

    }
}
