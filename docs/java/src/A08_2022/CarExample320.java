package A08_2022;

public class CarExample320 {
    public static void main(String[] args){
        Car319 nCar = new Car319();

        for(int i=0; i<=5;i++){
            int problemLocation=nCar.run();
            if(problemLocation!=0){
                System.out.println(nCar.tires[problemLocation-1].location+"change to hankook tire");
                nCar.tires[problemLocation-1] = new HankookTire315(nCar.tires[problemLocation-1].location,15 );
            }
            System.out.println("----------------------------------------------------------");
        }
        System.out.println("Progream is ovver...");
    }
}
