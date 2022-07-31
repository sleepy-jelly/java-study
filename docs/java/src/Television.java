public class Television {  // static initialization block example....
    static String company = "Samsung";
    static String model = "LCD";
    static String info;
    static{
        info = company+"-"+model;
    }
}
