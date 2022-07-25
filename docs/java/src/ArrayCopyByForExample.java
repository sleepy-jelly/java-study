public class ArrayCopyByForExample {
    public static void main(String[] args){
        int[] oldArray = {1,2,3};
        int[] newArray = new int[5];

        for(int i =0; i<oldArray.length;i++){
            newArray[i]=oldArray[i];

        }
        for(int i=0;i<newArray.length;i++){
            if(i==newArray.length-1){
                System.out.print(newArray[i]);
                break;
            }
            System.out.print(newArray[i]+", ");

        }   
        System.out.print('\n');
        System.out.println("Progream is over...");
    }
}
