package A08_2022;



public class ChildExample326 {
    public static void main(String[] args){
        Parent325 nParent = new Child325();
        nParent.field1 = "data1";
        nParent.mathod1();
        nParent.mathod2();


        /*
            nParent.mathod3();  /error
         */



         Child325 nChild = (Child325) nParent;

         nChild.field2 = "yy";


         
        nChild.method3();
        nChild.mathod1();
        nChild.mathod2();

    }
}
