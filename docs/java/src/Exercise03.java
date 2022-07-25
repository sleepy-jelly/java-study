public class Exercise03 {
    public static void main(String[] args){
        int nData=0;
        for(int i=1;i<=100;i++){
            if(i%3==0){
                nData=nData+i;
            }
           
        }
        System.out.println("Total multiple of 3 (1 to 100) : "+nData);
        System.out.println("Program is over");
    }
}