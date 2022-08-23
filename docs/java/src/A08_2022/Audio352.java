package A08_2022;

public class Audio352 implements RemoteControl347{
    //field
    private int volume;

    public void turnOn(){
        System.out.println("Turning on audio");
    }

    public void turnOff(){
        System.out.println("Turning off audio");
    }

    public void setVolume(int volume){
        if(volume>RemoteControl347.MAX_VOLUME){
            this.volume=RemoteControl347.MAX_VOLUME;
        }else if(volume<RemoteControl347.MIN_VOLUME){
            this.volume=RemoteControl347.MIN_VOLUME;
        }else{
            this.volume= volume;
        }
        System.out.println("Currently audio volume = "+this.volume);

    }

}
