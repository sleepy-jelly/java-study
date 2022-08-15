package A08_2022;


public class Tire314 {
    public int  maxRotation;
    public int accumulatedRotation;
    public String location;

    public Tire314(String location, int maxRotation){
        this.location = location;
        this.maxRotation= maxRotation;
    }


    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location+" Tire life time "+(maxRotation-accumulatedRotation)+" left");
            return true;
        }else{
            System.out.println("***"+location+" Tire punctured");
            return false;
        }   
    }
}
