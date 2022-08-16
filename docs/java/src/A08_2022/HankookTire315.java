package A08_2022;

public class HankookTire315 extends Tire314 {
    
    public HankookTire315(String location, int maxRotation){
        super(location,maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location+"HankookTire Life Time: "+(maxRotation-accumulatedRotation)+" count left");
            return true;
        }else{
            System.out.println("*** "+location+"HankookTire punctured");
            return false;
        }
    }
}
