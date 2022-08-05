public class ShopServiceExample{
    public static void main(String[] args){
        Printer newPrintln = new Printer();
        ShopService obj1 =ShopService.getInstance();
        ShopService obj2 =ShopService.getInstance();

        if(obj1 == obj2){
            newPrintln.println("same");
        }else{
            newPrintln.println("not same");
        }
        if(obj1.equals(obj2)){
            newPrintln.println("same");
        }else{
            newPrintln.println("not same");
        }











    }
}