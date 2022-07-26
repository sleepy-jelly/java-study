public class EnumMethodExample {
    public static void main(String[] args){

        Week today =Week.SUNDAY;
        String nameOfDay =today.name();
        System.out.println("name()"+nameOfDay);

        int ordinal = today.ordinal();
        System.out.println("ordinal()"+ordinal);

        Week today1 =Week.TUESDAY;
        int nData1= today.compareTo(today1);
        int nData2= today1.compareTo(today);
        System.out.println("compareTo()"+nData1);
        System.out.println("compareTo()"+nData2);

        Week weekDay = Week.valueOf("SATURDAY");
        System.out.println("valueOf()"+weekDay);

        Week[] days= Week.values();
        for(int i=0; i<days.length;i++){
            System.out.println("values()"+days[i]);
        }


        System.out.println("Program is over");

    }
}
