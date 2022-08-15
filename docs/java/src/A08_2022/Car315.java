package A08_2022;

public class Car315 {
    Tire314 frontLeftTire = new Tire314("frontLeft", 6);
    Tire314 frontRightTire = new Tire314("frontRight", 2);
    Tire314 backLeftTire = new Tire314("backLeft", 3);
    Tire314 backRightTire = new Tire314("backRight", 4);


    int run(){
        System.out.println("car is run");
        if(frontLeftTire.roll()==false){
            stop();
            return 1;
        }
        if(frontRightTire.roll()==false){
            stop();
            return 2;
        }
        if(backLeftTire.roll()==false){
            stop();
            return 3;
        }
        if(backRightTire.roll()==false){
            stop();
            return 4;
        }



        return 0;
    }

    void stop(){
        System.out.println("car is stop");
    }
}
