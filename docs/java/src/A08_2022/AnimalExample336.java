package A08_2022;


public class AnimalExample336 {
    public static void main(String[] args){
        Dog335 nDog335 = new Dog335();
        Cat336 nCat336 = new Cat336();

        nDog335.sound();
        nCat336.sound();
        System.out.println("----------------");

        Animal335  nAnimal335 = null;
        nAnimal335 = new Dog335();
        nAnimal335.sound();
        nAnimal335 = new Cat336();
        nAnimal335.sound();
        System.out.println("----------------");

        animalSound(new Dog335());
        animalSound(new Cat336());

        System.out.println("End of program..");
    }
    public static void animalSound(Animal335 nAnimal335){
        nAnimal335.sound();
    }

}
