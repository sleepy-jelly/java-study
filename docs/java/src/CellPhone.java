public class CellPhone {

        
    String model;
    String color;


    void powerOn(){
        System.out.println("Turning on power..");
    }
    void powerOff(){
        System.out.println("Turning off power..");
    }
    void bell(){
        System.out.println("Ringing bell..");
    }    
    void sendVoice(String message){
        System.out.println("Caller: "+message);
    }
    void receiveVoice(String message){
        System.out.println("Receiver: "+message);
    }
    void hangUp() {
        System.out.println("Hang up phone call");
    }



}
