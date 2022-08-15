package A08_2022;

public class KumhoTire316 extends Tire314{
    public KumhoTire316(String location, int maxRotation){
        super(location, maxRotation);
    }


    @Override
    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location+" KumhoTire Life time : "+ (maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println("*** "+location+" KumhoTire punctured");
            return false;
        }



    }
}
