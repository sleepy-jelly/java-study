public class Exercise06 {
    public static void main(String[] args){

        for(int i=0;i<=5;i++){

            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            if(i==0){
            continue;
            }
            System.out.print("\n");
        }


        
        System.out.println("Program is end...");

    }
}
