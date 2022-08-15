package A08_2022;

public class SupersonicAirplaneExample300 {
    public static void main(String[] args){
        SupersonicAirplane299 sa1 = new SupersonicAirplane299();

        sa1.take_off();
        sa1.fly();
        sa1.flymode= SupersonicAirplane299.SUPERSONIC;
        sa1.fly();
        sa1.flymode= SupersonicAirplane299.NORMAL;
        sa1.fly();
        sa1.land();



        System.out.println("End of program... ");
    }
}