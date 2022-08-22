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
        if(volume>MAX_VOLUME){
            this.volume=MAX_VOLUME;
        }else if(volume<MIN_VOLUME){
            this.volume=MIN_VOLUME;
        }else{
            this.volume= volume;
        }
        System.out.println("Currently audio volume = "+volume);

    }

}
