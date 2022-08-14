package A08_2022;

public class SupersonicAirplane299 extends Airplane299{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flymode =NORMAL;

    @Override 
    public void fly(){
        if(flymode==SUPERSONIC){
            System.out.println("flying super speed");
        }else{
            super.fly();
        }
    }
}
