public class Car {

    String company ="hyundai";
    String model ;
    String color ;
    int maxSpeed ;
    public Car (){    
    }
    public Car (String model){
        this(model,"yellow",250);
        }
    public Car ( String model, String color ){
        this.model =model;  
        this.color =color;
        }
   public Car (String model, String color, int maxSpeed ){
    this.model =model;  
    this.color =color;
    this.maxSpeed = maxSpeed;
    }
}   
