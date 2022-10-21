/**
 * @author Drumstyle92
 * class that contains the main method.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method that contains an Animal object,
     * two methods invoked that show the various sounds of the animal.
     */
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        // Animal class object creation
        Animal animal = new Animal("Cheetah");
        // show method 1
        animal.animalSound();
        // show method 2
        System.out.println("---------------------------------------------");
        animal.animalSound("hight");
        System.out.println("---------------------------------------------");
        animal.animalSound("low");
        System.out.println("---------------------------------------------");
        animal.animalSound("casual");
        System.out.println("---------------------------------------------");
    }
}
