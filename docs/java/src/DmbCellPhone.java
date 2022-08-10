public class DmbCellPhone extends CellPhone{
    int channel;

    



    DmbCellPhone(String model,String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("Start receive "+channel+" channel..");
    }
    void changeChannel(int channel){
        this.channel= channel;
        System.out.println("Change channel to "+channel);
    }
    void turnOffDmb(){
        System.out.println("Stop receiving dmb");
    }

}
