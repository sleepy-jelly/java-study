import java.util.Calendar;

public class EnumWeekExapmle {
    public static void main(String[] args){
        Week today =null;

        Calendar cal = Calendar.getInstance();
        int week =cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1:{
                today=Week.SUNDAY;
                break;
            }
            case 2:{
                today=Week.MONDAY;
                break;
            }
            case 3:{
                today=Week.TUESDAY;
                break;
            }
            case 4:{
                today=Week.WEDNESDAY;
                break;
            }
            case 5:{
                today=Week.THURSDAY;
                break;
            }
            case 6:{
                today=Week.FRIDAY;
                break;
            }
            case 7:{
                today=Week.SATURDAY;
                break;
            }
        }



        System.out.println("Today is : "+today);

       
        System.out.println("Today is : "+today);



        if(today==Week.SUNDAY){
            System.out.println("Today is time to ah.. chill out!");
        }else{
            System.out.println("Today is time to ah.. Study hard!");
        }



        System.out.println("Program is over");
    }
}




enum Week{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
} 
