public class Exercise04 {
    public static void main(String[] args){

        

            while(true){
                int nData1= (int)(Math.random()*6+1);
                int nData2= (int)(Math.random()*6+1);
                int nTotal= nData1+nData2;

                System.out.println("("+nData1+","+" "+nData2+")");
                
                if(nTotal==5){
                    System.out.println("you got 5"+'('+nData1+','+' '+nData2+')');

                    break;
                }

            }
    }
}
