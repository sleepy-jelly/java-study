package A08_2022;


public class Audio361 implements RemoteControl347 {
    private int volume;
    private boolean mute;

    public void turnOn(){
        System.out.println("Turning on..");
    }

    public void turnOff(){
        System.out.println("Turning off..");
    }


    public void setVolume(int setVolume){
        if(setVolume>MAX_VOLUME){
            this.volume=MAX_VOLUME;
        }else if(setVolume<MIN_VOLUME){
            this.volume=MIN_VOLUME;
        }else{
            this.volume =setVolume;
        }
        System.out.println("Currently audio volume = "+this.volume);
    }

    @Override
    public void setMute(boolean mute){
        this.mute = mute;
        if(this.mute){
            System.out.println("Audio mute..");
        }else{
            System.out.println("Audio unmute..");
        }
    }

    
}
