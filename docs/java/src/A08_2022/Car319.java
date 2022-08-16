package A08_2022;

public class Car319 {
    
    Tire314[] tires = {
        new Tire314("frontLeft",6),
        new Tire314("frontRight",2),
        new Tire314("backLeft",3),
        new Tire314("backRight",4)
    };


    int run(){
        System.out.println("car is running");
        for(int i = 0; i<tires.length;i++){
            if(tires[i].roll()==false){
                stop();
                return(i+1);
            }
        }
        return 0;
    }

    void stop(){
        System.out.println("car is stoped");
    }

}
