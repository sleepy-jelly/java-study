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
        System.out.println("------------------------------");
        System.out.println("create account");
        System.out.println("------------------------------");
        System.out.printf("account number: ");

        ano = sc1.next();
        System.out.printf("owner: ");
        owner = sc1.next();

        System.out.print("Initial deposit amount: ");
        balance = sc1.nextInt();

        Account20 ac1 =new Account20(ano,owner,balance);
        for(int i = 0; i<accountArray.length; i++){
            if(accountArray[i]==null){
            accountArray[i]=ac1;
            System.out.println("result: account is successfully created");
            break;
            }
        }
    }

    private static void accountList(){
        System.out.println("------------------------------");
        System.out.println("account list");
        System.out.println("------------------------------");
        
        for(int i=0; i<accountArray.length;i++){
            if(accountArray[i]==null){
                break;
            }else{
                System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
            }
        }
    }

    private static void deposit(){
        System.out.println("------------------------------");
        System.out.println("deposit");
        System.out.println("------------------------------");
        System.out.println("account number: ");
        String ano = sc1.next();
        if(findAccount(ano)==null){
            System.out.println("amount number is not in the list");
            return;
        }

        System.out.print("deposit amount: ");
        int value = sc1.nextInt();
        if (value>0){
            findAccount(ano).setBalance(findAccount(ano).getBalance()+value);
            System.out.println("result: deposit is successfully done");
        }else{
            System.out.println("deposit can't be -value");
        }
     }

    private static void withdraw(){
        System.out.println("------------------------------");
        System.out.println("withdraw");
        System.out.println("------------------------------");
        System.out.println("account number: ");
        String ano = sc1.next();
        if(findAccount(ano)==null){
            System.out.println("amount number is not in the list");
            return;
        }
        
        System.out.print("withdraw amount: ");
        int value = sc1.nextInt();
        if ((findAccount(ano).getBalance()-value)>0){
            findAccount(ano).setBalance(findAccount(ano).getBalance()-value);
            System.out.println("result: withdraw is successfully done");
        }else{
            System.out.println("withdraw can't over the deposit amount");
        }
    }

    private static Account20 findAccount(String ano){
        Account20 accountTemp = null;
        for(int i=0;i<accountArray.length;i++){
            if((accountArray[i].getAno()).equals(ano)){
                accountTemp=accountArray[i];
                return accountTemp;
            }
        }
        return accountTemp;
    }
}
