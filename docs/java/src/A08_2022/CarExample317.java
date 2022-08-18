package A08_2022;

public class CarExample317 {
    public static void main(String[] args){
        Car315 nCar = new Car315();


        for(int i=1; i<=5;i++){
            int problemLocation = nCar.run();


            switch(problemLocation){
                case 1:
                System.out.print("front left side of tire change to the hankooktire");
                nCar.frontLeftTire = new HankookTire315("frontLeft", 15);
                break;
                case 2:
                System.out.print("front left side of tire change to the hankooktire");
                nCar.frontRightTire = new KumhoTire316("frontRight", 13);
                break;
                case 3:
                System.out.print("front left side of tire change to the hankooktire");
                nCar.backLeftTire = new HankookTire315("backLeft", 14);
                break;
                case 4:
                System.out.print("front left side of tire change to the hankooktire");
                nCar.backRightTire = new KumhoTire316("backRight", 17);
                break;
            }
            System.out.println("----------------------------------------------------------");
        }
    }
}
