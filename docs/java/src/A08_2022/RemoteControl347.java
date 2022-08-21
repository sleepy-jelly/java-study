package A08_2022;

public interface RemoteControl347 {
    //constant number
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    //abstract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //default method
    public default void setMute(boolean mute){
        if(mute){
            System.out.println("Mute now..");
        }else{
            System.out.println("Unmute now..");
        }
    }

    //static method
    static void changeBattery(){
        System.out.println("Changing battery..");
    }
}
