package A08_2022;

public class Television351 implements RemoteControl347{
    private int volume;
    
    public void turnOn(){
        System.out.println("Turning on tv");
    }

    public void turnOff(){
        System.out.println("Turning off tv");
    }

    public void setVolume(int volume){
        if(volume>RemoteControl347.MAX_VOLUME){
            this.volume = RemoteControl347.MAX_VOLUME;
        }else if(volume<RemoteControl347.MIN_VOLUME){
            this.volume = RemoteControl347.MIN_VOLUME;
        }else{
            this.volume= volume;
        }
        System.out.println("Volume : "+this.volume);
    }

}
