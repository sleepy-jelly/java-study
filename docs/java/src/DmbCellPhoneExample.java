public class DmbCellPhoneExample {
    public static void main(String[] args){

        DmbCellPhone dmbNew1 = new DmbCellPhone("java", "black", 10);


        //inheritance by CellPhone

        System.out.println("Model : "+dmbNew1.model);
        System.out.println("Color : "+dmbNew1.color);




        //feild by DmbCellPhone

        System.out.println("Channel : "+dmbNew1.channel);

        dmbNew1.powerOn();
        dmbNew1.bell();
        dmbNew1.sendVoice("Hello?");
        dmbNew1.receiveVoice("I am tom");
        dmbNew1.sendVoice("ah hi");
        dmbNew1.hangUp();

        
        //Calling DmbCellPhone method
        
        dmbNew1.turnOnDmb();
        dmbNew1.changeChannel(12);
        dmbNew1.turnOffDmb();
    }
}
