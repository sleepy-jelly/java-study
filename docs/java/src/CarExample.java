public class CarExample {
    public static void main(String[] args){
        Car myCar1 = new Car("wat da dog doin", "yellow",350);

        System.out.println("color of car :"+myCar1.color);
        System.out.println("name of car :"+myCar1.model);
        System.out.println("company of car :"+myCar1.company);
        System.out.println("max speed :"+myCar1.maxSpeed);

        System.out.println("End of program... ");

        Car myCar2 = new Car("wat da cat doin");

        System.out.println("color of car :"+myCar2.color);
        System.out.println("name of car :"+myCar2.model);
        System.out.println("company of car :"+myCar2.company);
        System.out.println("max speed :"+myCar2.maxSpeed);

        System.out.println("End of program... ");
    }
    
}
