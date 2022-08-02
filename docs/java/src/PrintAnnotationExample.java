import java.lang.reflect.Method;
 // tbh idk why when i run this the result is always different i have to figure out tho  08/02/2022
public class PrintAnnotationExample {
    public static void main(String[] args){
        Method[] declaredMethods=  Service.class.getDeclaredMethods();

        for(Method method: declaredMethods){
            // checking apply about PrintAnnotation.
            if(method.isAnnotationPresent(PrintAnnotation.class)){
                // getting abj about PrintAnnotation.
                PrintAnnotation printAnnotation =method.getAnnotation(PrintAnnotation.class);

                //printing name of the method
                System.out.println("["+method.getName()+"]");

                //printing division line
                for(int i= 0; i<printAnnotation.number();i++){
                    System.out.print(printAnnotation.value());
                }

                System.out.println();
                
            }
            try{
                //calling method
                method.invoke(new Service());
            }catch(Exception e){
                System.out.println();
            }
        }
    }
}
