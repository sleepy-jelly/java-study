package A08_2022;

public class RemoteControlExample362 {
    public static void main(String[] args){
        RemoteControl347 nRC= null;


        nRC =new Television351();
        nRC.turnOn();
        nRC.setMute(true);

        nRC = new Audio361();
        nRC.turnOn();
        nRC.setMute(true);

 

    }
}
